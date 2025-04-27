public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapreFactory = new ShapeFactory();
        Shape shape = shapreFactory.getShape("circle");
        Shape shape1 = shapreFactory.getShape("rectangle");
        shape.draw();
        shape1.draw();

    }
}
