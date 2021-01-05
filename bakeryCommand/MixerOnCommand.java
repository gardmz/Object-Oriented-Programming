package bakeryCommand;

public class MixerOnCommand implements Command{
	Mixer mixer;
	public MixerOnCommand(Mixer mixer) 
    { 
       this.mixer = mixer; 
    } 
    public void execute() 
    { 
    	mixer.on(); 
    } 
}
