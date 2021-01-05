package myCommandPattern;

public class Alarm {
	String name;
	final static String LOUD = "Loud";
	final static String QUIET = "Queit";
	final static String OFF = "off";
	String volume;
	
	public Alarm(String name) {
		this.name = name;
		//new stuff
		volume = OFF;
	}
	public void on() {
		System.out.println(getName() + " is on");
	}
	public void off() {
		System.out.println(getName() + " is off");
		volume = OFF;
	}
	public String getName() {
		return this.name;
	}
	public void loud() {
		volume = LOUD;
	}
	public void quiet() {
		volume = QUIET;
	}
	public String getVolume() {
		return volume;
	}
}
