public class TriangleViewChain {

    private final Triangle.View view;
    private TriangleViewChain nextChain;

    public TriangleViewChain(Triangle.View view) {
        this.view = view;
    }

    public void setNextChain(TriangleViewChain nextChain){
        this.nextChain = nextChain;
    }

    public void start(Triangle triangle){
        if (triangle.getView() == view){
            System.out.println(triangle.getView());
            triangle.getSquare();
        } else if (nextChain != null){
            nextChain.start(triangle);
        } else {
            System.out.println("Не удалось определить тип треугольника");
        }
    }
}
