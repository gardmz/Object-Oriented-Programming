package command;

class RemoteControlTest 
{ 
    public static void main(String[] args) 
    { 
        SimpleRemoteControl remote = new SimpleRemoteControl(); 
        Light kitchenLight = new Light("Kitchen Light"); 
        Light livingroomLight = new Light("Living Room Light"); 

        Stereo kitchenStereo = new Stereo("Kitchen Stereo"); 
        Stereo bedroomStereo = new Stereo("Bedroom Stereo"); 

        // we can change command dynamically 
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
       
        LightOnCommand livingroomLightOn = new LightOnCommand(livingroomLight);
        LightOffCommand livingroomLightOff = new LightOffCommand(livingroomLight);
        
        StereoOnWithCDCommand kitchenStereoOn = new StereoOnWithCDCommand(kitchenStereo);
        StereoOffWithCDCommand kitchenStereoOff = new StereoOffWithCDCommand(kitchenStereo);
        
        StereoOnWithCDCommand bedroomStereoOn = new StereoOnWithCDCommand(bedroomStereo);
        StereoOffWithCDCommand bedroomStereoOff = new StereoOffWithCDCommand(bedroomStereo);
        
        remote.setCommand(0, kitchenLightOn, kitchenLightOff); 
        remote.setCommand(1, kitchenStereoOn, kitchenStereoOff); 
        remote.setCommand(2, livingroomLightOn, livingroomLightOff);
        remote.setCommand(3, bedroomStereoOn, bedroomStereoOff);
       

        System.out.println(remote);
        
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);
        
        
      /* remote.setCommand(new StereoOnWithCDCommand(stereo)); 
        remote.buttonWasPressed(); 
        remote.setCommand(new StereoOffCommand(stereo)); 
        remote.buttonWasPressed(); */
     } 
  } 
