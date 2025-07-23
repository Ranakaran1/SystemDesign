import Shapes.ShapeFactory;
import Shapes.Shapes;

public class App {
    public static void main(String[] args) throws Exception {
        
        ShapeFactory shapeFactory = new ShapeFactory();
        Shapes shapeObj= shapeFactory.getShapes("circle");
        shapeObj.draw();
    }
} 
