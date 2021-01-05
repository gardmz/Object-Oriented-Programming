package myCommandPattern;

public class SecurityCameraOffCommand implements Command{
	SecurityCamera cam;
	public SecurityCameraOffCommand(SecurityCamera cam) {
		this.cam = cam;
	}
	public void execute() {
		cam.off();
	}
	
	public void undo() {
		cam.on();
	}
}
