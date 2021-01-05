package casinoFacade;

public class CasinoFacade {
	private Slots slots = new Slots();
	private Lights lights = new Lights();
	private Bar bar = new Bar();
	private TableGames tableGames = new TableGames();
	
	public void openCasino(String[] game){
		System.out.println("The Casino is now opening:");
		lights.on();
		slots.on();
		bar.open();
		tableGames.open();
		tableGames.play(game);
		System.out.println("Enjoy!");
	}
	public void closeCasino() {
		System.out.println("The Casino is now closing:");
		lights.off();
		slots.off();
		bar.closed();
		tableGames.closed();
		System.out.println("Goodbye!");
		
	}
	
	

}
