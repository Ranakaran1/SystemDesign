package RoomElement;

import Visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor roomVisitor);   
} 