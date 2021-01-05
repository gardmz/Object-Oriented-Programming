package bakeryCommand;

public class Mixer {
	String name;
	int speed;
	
	public Mixer(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	public void on() {
		System.out.println(getName() + " is on and set to speed " + getSpeed());
	}
	public void off() {
		System.out.println(getName() + " is off ");
	}
	public String getName() {
		return this.name;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void setName(String name) {
		this.name=name;
	}
}
