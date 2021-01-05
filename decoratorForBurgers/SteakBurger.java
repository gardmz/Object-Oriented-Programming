package decoratorForBurgers;

public class SteakBurger extends Burger{

	public SteakBurger() {
		description = "Standard Burger served with a steak patty instead of beef";
	}
	public int getCost() {
		return 11;
	}
}
