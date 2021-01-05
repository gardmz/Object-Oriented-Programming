package decoratorForBurgers;

public class Lettuce extends BurgerDecorator{
		Burger burger;
		
		public Lettuce(Burger burger) {
			this.burger = burger;
		}

		public String getDescription() {
			return burger.getDescription() + ", fresh lettuce";
		}
		
		public int getCost() {
			return burger.getCost() + 1;
		}
}

