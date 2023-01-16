import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            String current = scanner.nextLine();
            list.add(current);
        }
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}