import Base.BasePizza;
import Base.Margherita;
import Toppings.Mushroom;
import Toppings.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BasePizza margherita = new Margherita();

        BasePizza mushroom = new Mushroom(margherita);
        BasePizza toppings = new ExtraCheese(new Mushroom(new Margherita()));

        System.out.println(mushroom.cost());
        System.out.println(toppings.cost());
    }
}
