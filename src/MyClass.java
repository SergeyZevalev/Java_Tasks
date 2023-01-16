public class MyClass {

    private final int i1;
    private final int i2;

    public MyClass(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public int sign(){
        int result;
        if (i1 > 0 && i2 > 0) result = 2;
        else if (i1 < 0 && i2 < 0) result = 1;
        else result = 0;
        return result;
    }

    @Override
    public String toString() {
        return i1 + " " + i2;
    }
}
