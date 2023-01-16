import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Seller {

    private final List<Buyer> observers;
    private final Timer timer;

    public Seller(List<Buyer> observers) {
        this.observers = observers;
        this.timer = new Timer();
    }

    public void init(){
        TimerTask task = new TimerTask() {
            int count = 1;
            @Override
            public void run() {
                if (count == 5) timer.cancel();
                System.out.println("Seller is offering coffee number " + count);
                notifyObservers(count);
                count++;
            }
        };
        timer.scheduleAtFixedRate(task,1000, (long) ((Math.random()*5000)+1000));

    }

    public void notifyObservers(int count){
        for (Observer observer: observers){
            observer.drinkCoffee();
        }
    }
}
