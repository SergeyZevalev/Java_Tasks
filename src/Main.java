import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Buyer> buyers = new ArrayList<>();
        buyers.add(new Buyer(1));
        buyers.add(new Buyer(2));
        buyers.add(new Buyer(3));
        Seller seller = new Seller(buyers);
        seller.init();

    }
}