package decoratorForBurgers;

public class CheeseBurger extends Burger{
	public CheeseBurger() {
		description = "Standard burger served with cheese";
	}
	public int getCost() {
		return 9;
	}
	
}
