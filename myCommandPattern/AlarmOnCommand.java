package myCommandPattern;

public class AlarmOnCommand implements Command{
	Alarm alarm;
	String prevVolume;
	
	public AlarmOnCommand(Alarm alarm) 
    { 
       this.alarm = alarm; 
    } 
    public void execute() 
    { 
       alarm.on(); 
       //prevVolume = alarm.getVolume();
    } 
    public void undo() {
    		alarm.off();
    	
    }
}
