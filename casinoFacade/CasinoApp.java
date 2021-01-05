package casinoFacade;

public class CasinoApp {
	
	public static void main(String[] arg) {
	CasinoFacade harrahsCasino = new CasinoFacade();
	
	String[] games = {"BlackJack", "ThreeCardPoker", "Texas Hold Em"};
	harrahsCasino.openCasino(games);
	System.out.println();
	
	harrahsCasino.closeCasino();
	
	}
	
}
