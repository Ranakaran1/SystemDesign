package Entities;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Parent {

    List<Parent> li ;
    public Directory(){
        li = new ArrayList<>();
    }
    @Override
    public void operation() {
        System.out.println("Directory operation");
        for(Parent p : li){
            p.operation();
        }
    }

    public void addP(Parent parent){
        li.add(parent);
    }
    
}
