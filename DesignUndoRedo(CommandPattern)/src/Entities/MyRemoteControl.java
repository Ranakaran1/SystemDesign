package Entities;

import java.util.Stack;

public class MyRemoteControl {
    Stack<ICommand> commands = new Stack<>();

    ICommand iCommand;
    public MyRemoteControl() {
    }

    public void setCommand(ICommand command){
        this.iCommand = command;
    }

    public void pressButton(){
        this.iCommand.execute();
        commands.add(iCommand);
    }

    public void undo(){
        if(!commands.isEmpty()){
            ICommand command = commands.pop();
            command.undo();
        }
    }




    
}
