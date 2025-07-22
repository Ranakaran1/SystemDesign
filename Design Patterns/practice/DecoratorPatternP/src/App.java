import Base.BasePizza;
import Base.FarmHouse;
import Topping.ExtraCheese;
import Topping.Mushroom;
import Topping.ToppingDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        FarmHouse basePizza = new FarmHouse();
        ExtraCheese extraCheese = new ExtraCheese(basePizza);
        ToppingDecorator mushroom = new Mushroom(extraCheese);

        System.out.println(mushroom.cost());

    }
}
