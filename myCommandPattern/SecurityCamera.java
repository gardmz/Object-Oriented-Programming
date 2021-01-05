package myCommandPattern;

public class SecurityCamera {
	String name;
	
	public SecurityCamera(String name) {
		this.name = name;
	}
	public void on() {
		System.out.println(getName() + " are on");
	}
	public void off() {
		System.out.println(getName() + " are off");
	}
	public String getName() {
		return this.name;
	}
}
