import java.util.Timer;
import java.util.TimerTask;

public class NewsFactory {

    private final Timer timer;
    private final NewsCallback callback;

    private int count = 0;

    public NewsFactory(NewsCallback callback) {
        this.callback = callback;
        this.timer = new Timer();
    }

    public void init(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                callback.provideNews(new News(count));
                count++;
                if (count == 40) timer.cancel();
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 3000);
    }
}
