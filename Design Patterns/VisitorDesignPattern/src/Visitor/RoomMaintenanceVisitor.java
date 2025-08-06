package Visitor;

import RoomElement.DeluxeRoom;
import RoomElement.DoubleRoom;
import RoomElement.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom roomElement) {
        System.out.println("Maintenance charge for Single room ");
        roomElement.price = 200;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintenance charge for Double room ");
        doubleRoom.price = 300;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Maintenance charge for Deluxe room ");
        deluxeRoom.price = 400;
    }
    
}
