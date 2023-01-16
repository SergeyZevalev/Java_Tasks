public class Fura {

    private final int number;
    private final int capacity;

    public Fura(int number) {
        this.number = number;
        this.capacity = (int) (Math.random()*90)+10;
    }

    public int getNumber(){
        return number;
    }

    public int speed(){
        return capacity/10;
    }
}
