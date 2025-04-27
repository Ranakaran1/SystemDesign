import Base.*;
import Toppings.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BasePizza pizza = new Margherita();
        System.out.println("Margherita cost: " + pizza.cost());

        pizza = new Mushroom(pizza);
        System.out.println("Margherita + Mushroom cost: " + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println("Margherita + Mushroom + Extra Cheese cost: " + pizza.cost());

    }
}
