package myCommandPattern;

public class AlarmLoudCommand implements Command{
	Alarm alarm;
	String prev;
	
	public AlarmLoudCommand(Alarm alarm) {
		this.alarm = alarm;
	}
	
	@Override
	public void execute() {
		prev = alarm.getVolume();
		alarm.loud();
	}
	
	@Override
	public void undo() {
		if(prev == Alarm.LOUD) {
			alarm.loud();
		}else if(prev == Alarm.QUIET) {
			alarm.quiet();
		}else if(prev == Alarm.OFF) {
			alarm.off();
		}
	}

}
