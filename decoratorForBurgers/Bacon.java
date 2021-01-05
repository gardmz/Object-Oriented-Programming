package decoratorForBurgers;

public class Bacon extends BurgerDecorator{
	Burger burger;
	
	public Bacon(Burger burger) {
		this.burger = burger;
	}
	public String getDescription() {
		return burger.getDescription() + ", bacon";
	}
	public int getCost() {
		return burger.getCost() + 2;
	}
}
