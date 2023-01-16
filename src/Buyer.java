import java.util.Timer;
import java.util.TimerTask;

public class Buyer implements Observer{

    private final int id;
    private int cash;
    private int drinkCount;
    private boolean isDrinking;
    private final Timer timer;
    private int coffeeCount;

    public Buyer(int id) {
        this.id = id;
        this.cash = (int) (Math.random()*100);
        this.drinkCount = 0;
        this.timer = new Timer();
        this.coffeeCount = 0;
        isDrinking = false;
    }

    @Override
    public void drinkCoffee() {
        if (drinkCount == 2){
            System.out.println("Buyer " + id + " is out of coffee!");
            timer.cancel();
        }
        else if(cash < 10){
            System.out.println("Buyer " + id + " is out of cash!");
            timer.cancel();
        }
        else if(isDrinking) System.out.println("Buyer " + id + " id drinking coffee!" + " " + coffeeCount);
        else {
            coffeeCount++;
            System.out.println("Buyer " + id + " begin drinking coffee!" + " " + coffeeCount);
            drinkCount++;
            cash -= 10;
            changeDrinkStatus();
            int finalCoffeeCount = coffeeCount;
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Buyer " + id + " have drunk coffee!" + " " + finalCoffeeCount);
                    changeDrinkStatus();
                }
            };
            timer.schedule(task, 5000);
        }
    }

    public void changeDrinkStatus(){
        isDrinking = !isDrinking;
    }
}
