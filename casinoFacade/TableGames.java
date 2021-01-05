package casinoFacade;

import java.util.Arrays;

public class TableGames {
	
	public void open() {
		System.out.println("Table Games are now open");
	}	
	public void closed() {
		System.out.println("Table Games are now closed");
	}
	public void play(String[] game) {
		System.out.println("Enjoy playing one of the following games " + Arrays.toString(game));
	}
}
