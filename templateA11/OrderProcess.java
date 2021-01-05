package templateA11;

public abstract class OrderProcess {
	
	public boolean isGift;

	public abstract void purchase();

	public abstract void makePayment();

	public final void giftWrap() {
		System.out.println("Gift wrap done.");
	}

	public abstract void deliver();

	public final void processOrder() {
		purchase();
		makePayment();
		if (isGift) {
			giftWrap();
		}
		deliver();
	}
}
