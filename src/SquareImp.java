public class SquareImp {

    private final Triangle.View view;
    private final double a;
    private final double b;
    private final double c;

    public SquareImp(Triangle.View view, double a, double b, double c) {
        this.view = view;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getSquare(){
        double result;
        switch (view){
            case EQUILATERAL: result = a*a*(Math.sqrt(3)/4);
            case ISOSCELES: {
                if (a == b) result = pifagorSide(a,c);
                if (a == c) result = pifagorSide(a,b);
                else result = pifagorSide(b,a);
            }
            case RECTANGULAR: {
                double max = Math.max(a, Math.max(b,c));
                if (max == a){
                    result = pifagorSquare(b,c);
                } else if (max == b){
                    result = pifagorSquare(a,c);
                } else result = pifagorSquare(b,c);
            }
            default: {
                double p = (a+b+c)/2;
                result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            }
        }
        System.out.println(result);;
    }

    private double pifagorSide(double equals, double base){
        return Math.sqrt(equals*equals-base/2*base/2)*base/2;
    }

    private double pifagorSquare(double a, double b){
        return a*b/2;
    }
}
