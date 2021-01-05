package projectFiles;

public class AnimalSimulator {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Lion();
		
		for(int i=0;i<animals.length;i++) {
			animals[i].makeSound();
			animals[i].display();
			System.out.println();
		}
		
		int x = 7/2;
		System.out.println(x);
	}
}
