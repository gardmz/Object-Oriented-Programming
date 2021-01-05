package observer;
import observer.MyModel.Person;

public class Main {

    public static void main(String[] args) {
        MyModel model = new MyModel();
        MyObserver observer = new MyObserver(model);
       
        for (Person person : model.getIndividuals()) {
            person.setLastName(person.getLastName() + "-Smith");
        }
        
        for (Person person : model.getIndividuals()) {
            person.setMiddleInitial(person.getMiddleInitial() + "-X");
        }
                
        for (Person person : model.getIndividuals()) {
            person.setFirstName(person.getFirstName() + "-James");
        }
    }
}
