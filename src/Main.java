import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass(-1,2));
        myClassList.add(new MyClass(-1,-3));
        myClassList.add(new MyClass(-1,0));
        myClassList.add(new MyClass(3,2));
        myClassList.add(new MyClass(-1,-11));
        myClassList.add(new MyClass(3,5));
        myClassList.add(new MyClass(99,-2));
        myClassList.add(new MyClass(0,0));

        myClassList.sort(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o2.sign()-o1.sign();
            }
        });

        System.out.println(myClassList);

    }
}