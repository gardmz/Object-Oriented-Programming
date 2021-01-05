package bakeryCommand;

public class RemoteControlTest {

	public static void main(String[] args) {

		RemoteControl remote = new RemoteControl();
		Oven oven1 = new Oven("Oven 1", 450);
		Oven oven2 = new Oven("Oven 2", 350);
		
		OvenOnCommand oven1On = new OvenOnCommand(oven1);
		OvenOffCommand oven1Off = new OvenOffCommand(oven1);

		OvenOnCommand oven2On = new OvenOnCommand(oven2);
		OvenOffCommand oven2Off = new OvenOffCommand(oven2);
		
		Mixer mix1 = new Mixer("Mixer 1", 5);
		Mixer mix2 = new Mixer("Mixer 2", 10);
		MixerOnCommand mix1On = new MixerOnCommand(mix1);
		MixerOffCommand mix1Off = new MixerOffCommand(mix1);
		MixerOnCommand mix2On = new MixerOnCommand(mix2);
		MixerOffCommand mix2Off = new MixerOffCommand(mix2);
		
		
		//creating partymode commands
		Command[] partyOn = {mix1On, oven1On, oven2On, mix2On};
		
		Command[] partyOff = {mix1Off, mix2Off, oven1Off, oven2Off};
		
		SubCommand partyOnSubCom = new SubCommand(partyOn);
		SubCommand partyOffSubCom = new SubCommand(partyOff);
		
		remote.setCommand(0, oven1On, oven1Off);
		remote.setCommand(1, oven2On, oven2Off);
		remote.setCommand(2, mix1On, mix1Off);
		remote.setCommand(3, mix2On, mix2Off);
		
		//adding partyCommands to remote
		remote.setCommand(4, partyOnSubCom, partyOffSubCom);
		
		System.out.println(remote);

		/*remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);

		remote.onButtonWasPressed(1);
		remote.offButtonWasPressed(1);
		
		remote.onButtonWasPressed(2);
		remote.onButtonWasPressed(3);
		*/
		remote.onButtonWasPressed(4);
		
		System.out.println("Turn Everything Off ?");
		
		remote.offButtonWasPressed(4);
		
		
		
	}
}
