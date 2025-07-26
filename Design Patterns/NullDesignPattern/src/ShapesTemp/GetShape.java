package ShapesTemp;

public class GetShape {
    public Shapes getShapes(String shape){

        if(shape.toLowerCase().equals("square")){
            return new Square();
        }
        else if(shape.toLowerCase().equals("rectangle")){
            return new Rectangle();
        }
        return new Nullable();

    }
}
