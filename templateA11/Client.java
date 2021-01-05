package templateA11;

public class Client {
	
	public static void main(String[] args) {
		
		OrderProcess inStoreOrder = new InStoreOrder();
		inStoreOrder.processOrder();
		System.out.println("------------------------------------------");
		OrderProcess onlineOrder = new OnlineOrder();
		onlineOrder.processOrder();
		System.out.println("------------------------------------------");
		CryptoOrder cryptoOrder = new CryptoOrder();
		cryptoOrder.processOrder();
		
	}
}
