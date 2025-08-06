package Visitor;


import RoomElement.DeluxeRoom;
import RoomElement.DoubleRoom;
import RoomElement.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom roomElement) {
       System.out.println("Price for single room");
       roomElement.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Price for double room");
        doubleRoom.price = 1500;

    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Price for delux room");
        deluxeRoom.price = 2000;
    }
    
}
