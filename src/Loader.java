import java.util.Timer;
import java.util.TimerTask;

public class Loader {

    private boolean isBusy;
    private final Timer timer;

    public Loader(){
        this.isBusy = false;
        timer = new Timer();
    }

    public void changeBusiness(){
        this.isBusy = !isBusy;
    }

    public boolean getBusiness(){
        return isBusy;
    }

    public void unload(Fura fura){
        changeBusiness();
        System.out.println("Loader start unloading fura number " + fura.getNumber());
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Loader have unloaded fura number " + fura.getNumber());
                changeBusiness();
                if(fura.getNumber() == 9) timer.cancel();
            }
        };
        timer.schedule(task, fura.speed()* 1000L);
    }
}
