package decoratorForBurgers;

public class BurgerKing {
	
	public static void main(String args[]) {
		Burger burger = new HeartAttackBurger();
		Burger burger1 = new CheeseBurger();
		Burger burger2 = new SteakBurger();
		Burger[] menuItems = new Burger[3];
		
		menuItems[0] = burger;
		menuItems[1] = burger1;
		menuItems[2] = burger2;
				
		getMenu(menuItems);
		
		System.out.println("-------------------------");
		
		burger1 = new Tomato(burger1);
		burger1 = new Lettuce(burger1);
		burger1 = new Bacon(burger1);
		
		burger2 = new Lettuce(burger2);
		burger2 = new Bacon(burger2);	
		
		System.out.println(burger1.getDescription() + " Cost: " + "$" + burger1.getCost());
		System.out.println(burger2.getDescription() + " Cost: " + "$" + burger2.getCost());
	}
	public static void getMenu(Burger[] burgers) {
		System.out.println("Burger Menu:");

		for(int i=0;i<burgers.length;i++) {
			System.out.println(burgers[i].getDescription() + " Cost $"+ burgers[i].getCost() + " with no additional toppings ");
		}
	}
}
