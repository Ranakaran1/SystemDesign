import ShapesTemp.GetShape;
import ShapesTemp.Shapes;

public class App {
    public static void main(String[] args) throws Exception {
        GetShape getShape = new GetShape();
        Shapes shape = getShape.getShapes("square");
        shape.draw();
    }
}
