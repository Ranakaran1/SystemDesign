import Entities.Decorator;
import Entities.Item1;
import Entities.Item2;
import Entities.PercentageCoupanDecorator;
import Entities.ProductType;
import Entities.TypeCoupanDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        Item1 item1 = new Item1(1, 100, "bulb", ProductType.ELECTRONICS);
        Item2 item2 = new Item2(2, 150, "Shirt", ProductType.GARMENTS);

        Decorator percentageCoupanDecorator = new PercentageCoupanDecorator(item1, 10);
        System.out.println(percentageCoupanDecorator.getPrice());

        Decorator typeCoupanDecorator = new TypeCoupanDecorator(percentageCoupanDecorator, 15);
        System.out.println(typeCoupanDecorator.getPrice());
    }
}
