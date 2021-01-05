package myCommandPattern;

public class Remote {
	Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public Remote() 
    { 
    	onCommands = new Command[7];
    	offCommands = new Command[7];
    	
    	Command noCommand = new NoCommand();
    	for(int i = 0;i<7;i++) {
    		onCommands[i] = noCommand;
    		offCommands[i] = noCommand;
    	}
    	undoCommand = noCommand;
    	
    } 
  
    public void setCommand(int slot, Command onCommand, Command offCommand)
    { 
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        
    } 
  
    public void onButtonWasPressed(int slot) 
    { 
        onCommands[slot].execute(); 
        undoCommand = onCommands[slot];
    } 
    public void offButtonWasPressed(int slot) 
    { 
        offCommands[slot].execute(); 
        undoCommand = offCommands[slot];
    } 
    public void undoButtonPressed() {
    	undoCommand.undo();
    }
    public String toString() {
    	StringBuffer stringBuff = new StringBuffer();
    	stringBuff.append("\n-------- Remote Control ----------\n");
    	for(int i=0; i < onCommands.length; i++) {
    		stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +  "\t \t" + offCommands[i].getClass().getName() + "\n");
    	}
    	return stringBuff.toString();
    }
}
