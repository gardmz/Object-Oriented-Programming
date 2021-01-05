package decoratorForBurgers;

public class HeartAttackBurger extends Burger{
	public HeartAttackBurger() {
		description = "Standard burger served with a fried egg on it";
	}
	public int getCost() {
		return 11;
	}
}
