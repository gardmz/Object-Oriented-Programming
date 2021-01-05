package command;

public class Light {
	String name;
	
	public Light(String name) {
		this.name = name;
	}
	public void on() {
		System.out.println(getName() + " is on");
	}
	public void off() {
		System.out.println(getName() + " is off");
	}
	public String getName() {
		return this.name;
	}
}
