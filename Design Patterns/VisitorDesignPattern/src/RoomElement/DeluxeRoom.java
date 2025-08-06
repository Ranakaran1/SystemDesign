package RoomElement;

import Visitor.RoomVisitor;

public class DeluxeRoom implements RoomElement{

    public int price;

    @Override
    public void accept(RoomVisitor roomVisitor) {
       roomVisitor.visit(this);
    }
    
}
