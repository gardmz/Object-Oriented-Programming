package myCommandPattern;

public class RemoteTest {
	
	public static void main(String args[]) {
		
	Remote remote = new Remote(); 
	
    Alarm houseAlarm = new Alarm("House Alarm"); 
    Alarm carAlarm = new Alarm("Car Alarm"); 
    
    AlarmOnCommand alarmOn = new  AlarmOnCommand(houseAlarm);
    AlarmOffCommand alarmOff = new  AlarmOffCommand(houseAlarm);
   
    AlarmOnCommand carAlarmOn = new  AlarmOnCommand(carAlarm);
    AlarmOffCommand carAlarmOff = new  AlarmOffCommand(carAlarm);
    
    AlarmLoudCommand alarmLoud = new AlarmLoudCommand(houseAlarm);
    
    SecurityCamera camOutside = new SecurityCamera("Outside cameras");
    SecurityCamera camInside = new SecurityCamera("Inside cameras");
    
    SecurityCameraOnCommand camOutsideOn = new SecurityCameraOnCommand(camOutside);
    SecurityCameraOffCommand camOutsideOff = new SecurityCameraOffCommand(camOutside);
    
    SecurityCameraOnCommand camInsideOn = new SecurityCameraOnCommand(camInside);
    SecurityCameraOffCommand camInsideOff = new SecurityCameraOffCommand(camInside);
    
    System.out.println("Alarms:");
    remote.setCommand(0, alarmOn, alarmOff); 
    remote.setCommand(1, carAlarmOn, carAlarmOff);
    
    remote.setCommand(2, camOutsideOn, camOutsideOff);
    remote.setCommand(3, camInsideOn, camInsideOff);
    
    //testing loud command
    remote.setCommand(4, alarmLoud, alarmOff);
    //System.out.println(remote);
    
    remote.onButtonWasPressed(0);
    remote.onButtonWasPressed(1);
    //testing undo 
    remote.undoButtonPressed();
    System.out.println("Cameras:");
    remote.onButtonWasPressed(2);
    remote.onButtonWasPressed(3);
    System.out.println("Alarms:");
    remote.offButtonWasPressed(0);
    remote.offButtonWasPressed(1);
    System.out.println("Cameras:");
    remote.offButtonWasPressed(2);
    remote.offButtonWasPressed(3);
	}
}