import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberList {

    private final List<Integer> numberList;

    public NumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    @Override
    public String toString() {
        return numberList.toString();
    }

    public int maxNumber(){
        return Collections.max(numberList);
    }
    public int minNumber(){
        return Collections.min(numberList);
    }

    public List<Integer> sortMinToMax(){
        List<Integer> sorted = new ArrayList<>(numberList);
        sorted.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return sorted;
    }

    public List<Integer> sortMaxToMin(){
        List<Integer> sorted = new ArrayList<>(numberList);
        sorted.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return sorted;
    }

    public boolean contains(int number){
        return numberList.contains(number);
    }

    public List<Integer> maxThen(int number){
        List<Integer> sorted = new ArrayList<>(numberList);
        List<Integer> removeNumber = new ArrayList<>();
        for (int i: sorted){
            if (i < number) removeNumber.add(i);
        }
        sorted.removeAll(removeNumber);
        return sorted;
    }

    public int sumNumberList(){
        int sum = 0;
        for (int i: numberList){
            sum += i;
        }
        return sum;
    }

    public List<Integer> zeroReplace(){
        List<Integer> replaced = new ArrayList<>(numberList);
        for (int i = 0; i< replaced.size(); i++){
            if (replaced.get(i) == 0) replaced.set(i,Integer.MAX_VALUE);
        }
        return replaced;
    }
}
