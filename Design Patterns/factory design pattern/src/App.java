public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeObj = shapeFactory.getShape("circle");
        shapeObj.draw();
        Shape shapeObj1 = shapeFactory.getShape("rectangle");
        shapeObj1.draw();
    }
}
