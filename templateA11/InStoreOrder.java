package templateA11;

import java.util.Scanner;

public class InStoreOrder extends OrderProcess{
	
Scanner input = new Scanner(System.in);
	
	@Override
	public void purchase() {
		System.out.println("Item added to shopping cart");
		System.out.print("Would you like the product gift wrapped (y/n)? ");
		if(isGift()) {
			giftWrap();
		}else
			System.out.println("Product is not being wrapped");
	}
	
	public void deliver() {}
	
	@Override
	public void makePayment() {
		System.out.print("Would you like to pay with cash or credit/debit? ");
		String payment = input.next();
		if(payment.toLowerCase().equals("cash")){
			System.out.println("In store purcahse made with cash");
		}else
			System.out.println("In store purchase made with credit/debit");
	}

	public boolean isGift() {		
		String ans = input.next();
        if( ans.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
	}
}
