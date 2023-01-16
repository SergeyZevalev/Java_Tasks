public class Triangle {

    private final double a;
    private final double b;
    private final double c;

    private final View view;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.view = defineTriangle();
    }

    public void getSquare(){
        SquareImp result = new SquareImp(view, a, b, c);
        result.getSquare();
    }

    public View getView(){
        return view;
    }

    private View defineTriangle() {
        View result = null;
        if (a == b && a == c) result = View.EQUILATERAL;
        if (a == b && a != c || a == c && a != b || b == c && b != a) result = View.ISOSCELES;
        if (isRectangular(a, b, c)) result = View.RECTANGULAR;
        else result = View.COMMON;
        return result;

    }

    enum View {
        EQUILATERAL,
        ISOSCELES,
        RECTANGULAR,
        COMMON
    }

    private boolean isRectangular(double a, double b, double c) {
        boolean result = false;
        if (a == pifagorOneSide(b,c) ||
                b == pifagorOneSide(a,c) ||
                c == pifagorOneSide(a,b)) result = true;
        return result;
    }

    private double pifagorOneSide(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
}
