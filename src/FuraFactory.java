import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FuraFactory {

    private final LoaderCallback callback;
    private final int SIZE = 10;
    private final List<Fura> furaPark;
    private final Timer timer;
    private int count = 0;

    public FuraFactory(LoaderCallback callback) {
        this.callback = callback;
        furaPark = new ArrayList<>(SIZE);
        timer = new Timer();
    }

    public void initFactory() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (count == SIZE) {
                    timer.cancel();
                } else {
                    Fura newFura = new Fura(count);
                    System.out.println("Fura number " + newFura.getNumber() + " have arrived!");
                    furaPark.add(newFura);
                    count++;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, (long) (Math.random() * 9000) + 1000);
        start();
    }

    public void start() {
        Fura currentFura = null;
        int count = 0;
        do {
            if (!callback.updateStatus() && furaPark.size() != 0) {
                currentFura = furaPark.get(0);
                callback.unload(currentFura);
                furaPark.remove(0);
                count ++;
            }
        }
        while (count != SIZE);
    }
}
