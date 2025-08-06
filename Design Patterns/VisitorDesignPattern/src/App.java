import RoomElement.DeluxeRoom;
import RoomElement.DoubleRoom;
import RoomElement.RoomElement;
import RoomElement.SingleRoom;
import Visitor.RoomPricingVisitor;
import Visitor.RoomVisitor;

public class App {
    public static void main(String[] args) throws Exception {
        SingleRoom singleroom = new SingleRoom();
        DoubleRoom doubleroom = new DoubleRoom();
        DeluxeRoom deluxroom = new DeluxeRoom();
        
        RoomVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleroom.accept(roomPricingVisitor);
        // System.out.println(singleroom.price);

        roomPricingVisitor.visit(singleroom);

        roomPricingVisitor.visit(deluxroom);




    }
}
