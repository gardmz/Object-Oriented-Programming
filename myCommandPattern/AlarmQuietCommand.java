package myCommandPattern;

public class AlarmQuietCommand implements Command{
		Alarm alarm;
		String prev;
		
		public AlarmQuietCommand(Alarm alarm) {
			this.alarm = alarm;
		}
		
		@Override
		public void execute() {
			prev = alarm.getVolume();
			alarm.quiet();
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


