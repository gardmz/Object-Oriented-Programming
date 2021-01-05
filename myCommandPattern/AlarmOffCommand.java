package myCommandPattern;

public class AlarmOffCommand implements Command{
	Alarm alarm;
	
	public AlarmOffCommand(Alarm alarm) 
    { 
       this.alarm = alarm; 
    } 
    public void execute() 
    { 
       alarm.off();
    } 
    public void undo() {
    	alarm.on();
    }    
}
