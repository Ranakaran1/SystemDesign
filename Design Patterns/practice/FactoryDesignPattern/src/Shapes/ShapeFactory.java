package Shapes;

public class ShapeFactory {
    public Shapes getShapes(String input){
        if(input.equals("circle")){
            return new Circle();
        }
        else if(input.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
