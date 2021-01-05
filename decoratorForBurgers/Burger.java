package decoratorForBurgers;

public abstract class Burger {
	String description = "Unknow Burger";
	
	public String getDescription() {
		return description;
	}
	public abstract int getCost();
	
}
