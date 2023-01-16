public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        TriangleViewChain chain1 = new TriangleViewChain(Triangle.View.EQUILATERAL);
        TriangleViewChain chain2 = new TriangleViewChain(Triangle.View.ISOSCELES);
        TriangleViewChain chain3 = new TriangleViewChain(Triangle.View.RECTANGULAR);
        TriangleViewChain chain4 = new TriangleViewChain(Triangle.View.COMMON);
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain1.start(triangle);
    }
}