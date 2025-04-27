public class ShapeFactory {

    Shape getShape(String input){

        if(input=="circle"){
            return new Circle();
        }
        else if(input=="rectangle"){
            return new Rectangle();
        }
        else{
            return null;
        }
    }

}
