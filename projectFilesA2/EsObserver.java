package projectFilesA2;

public class EsObserver {
public static void main(String[] args) {
		
		Subject s = new Subject();
		
		Concerned o = new Concerned();
		
		s.addObserver(o);
		
		s.setProperty("new");

	}
}
