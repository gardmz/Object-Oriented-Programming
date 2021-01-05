package templateA11;

import java.util.Scanner;

public class OnlineOrder extends OrderProcess{
	
	Scanner input = new Scanner(System.in);
	
	@Override
	public void purchase() {
		System.out.println("Item added to online shopping cart");
		System.out.print("Would you like the product gift wrapped (y/n)? ");
		if(isGift()) {
			giftWrap();
		}else
			System.out.println("Product is not being wrapped");
	}

	@Override
	public void makePayment() {
		System.out.println("Online Payment made through website with credit card");
	}

	public boolean isGift() {		
		String ans = input.next();
        if( ans.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
	}

	@Override
	public void deliver() {
		System.out.println("Shipping item to desired address");		
	}
}
