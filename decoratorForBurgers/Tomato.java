package decoratorForBurgers;

public class Tomato extends BurgerDecorator{
	Burger burger;
	
	public Tomato(Burger burger) {
		this.burger = burger;
	}
	public String getDescription() {
		return burger.getDescription() + ", fresh tomato";
	}
	public int getCost() {
		return burger.getCost() + 1;
	}
}
