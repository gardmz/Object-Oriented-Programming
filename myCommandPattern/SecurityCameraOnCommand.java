package myCommandPattern;

public class SecurityCameraOnCommand implements Command{
	SecurityCamera cam;
	public SecurityCameraOnCommand(SecurityCamera cam) {
		this.cam = cam;
	}
	public void execute() {
		cam.on();
	}
	
	public void undo() {
		cam.off();
	}
}
