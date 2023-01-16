import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(113);
        numberList.add(13);
        numberList.add(1);
        numberList.add(78);
        numberList.add(0);
        NumberList myNumberList = new NumberList(numberList);

        System.out.println(myNumberList.maxNumber());
        System.out.println(myNumberList);

        System.out.println(myNumberList.minNumber());
        System.out.println(myNumberList);

        System.out.println(myNumberList.sortMinToMax());
        System.out.println(myNumberList);

        System.out.println(myNumberList.sortMaxToMin());
        System.out.println(myNumberList);

        System.out.println(myNumberList.contains(8));
        System.out.println(myNumberList);

        System.out.println(myNumberList.sumNumberList());
        System.out.println(myNumberList);

        System.out.println(myNumberList.zeroReplace());
        System.out.println(myNumberList);

        System.out.println(myNumberList.maxThen(2));
        System.out.println(myNumberList);


    }
}