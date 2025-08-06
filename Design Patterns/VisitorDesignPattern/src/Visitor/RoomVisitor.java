package Visitor;


import RoomElement.DeluxeRoom;
import RoomElement.DoubleRoom;
import RoomElement.SingleRoom;

public interface RoomVisitor {
    
    public void visit(SingleRoom roomElement);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxeRoom deluxeRoom);

}
