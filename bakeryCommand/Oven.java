package bakeryCommand;

public class Oven {
	String name;
	int temp;
	
	public Oven(String name, int temp) {
		this.name = name;
		this.temp = temp;
	}
	public void on() {
		System.out.println(getName() + " is on and set to " + getTemp() + " degrees");
	}
	public void off() {
		System.out.println(getName() + " is off ");
	}
	public String getName() {
		return this.name;
	}
	public int getTemp() {
		return this.temp;
	}
	public void setTemp(int temp) {
		this.temp=temp;
	}
	public void setName(String name) {
		this.name=name;
	}
}	
