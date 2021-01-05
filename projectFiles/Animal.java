package projectFiles;

public abstract class Animal {
	AnimalSound soundOfAnimal;

	public Animal() {	
	}
	
	abstract void display();

	public void makeSound() {
		soundOfAnimal.sound();
	}
	
	public void setSound(AnimalSound sm) {
		soundOfAnimal = sm;
	}
	
}