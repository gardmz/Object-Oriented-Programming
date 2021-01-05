package projectFiles;

public class Dog extends Animal{
	
	public Dog() {
		soundOfAnimal = new Bark();
	}
	
	public void display() {
		System.out.println("Im a dog");
		
	}
}
