package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
    public static final String FIRSTNAME = "fName";
    public static final String MIDDLEINITIAL = "middleInitial";
    public static final String LASTNAME = "lName";

    private List<Person> people = new ArrayList<Person>();
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    public class Person {

        private String fName;
        private String middleInitial;
        private String lName;

        public Person(String fName, String middleInitial, String lName) {
            this.fName = fName;
            this.lName = lName;
            this.middleInitial = middleInitial;
        }

        public String getFirstName() {

            return fName;
        }

        public void setFirstName(String fName) {
            notifyListeners(
                    this,
                    FIRSTNAME,
                    this.fName,
                    this.fName = fName);

        }
        public String getMiddleInitial() {
            return middleInitial;
        }

        public void setMiddleInitial(String middleInitial) {
            notifyListeners(
                    this,
                    MIDDLEINITIAL,
                    this.middleInitial,
                    this.middleInitial = middleInitial);

        }

        public String getLastName() {
            return lName;
        }

        public void setLastName(String lName) {
            notifyListeners(
                    this,
                    LASTNAME,
                    this.lName,
                    this.lName = lName);
        }
    }

    public List<Person> getIndividuals() {
        return people;
    }

    public MyModel() {
    	people.add(new Person("Gard", "M", "Zeringue"));
    	people.add(new Person("Michael", "B", "Jordan"));
    	people.add(new Person("Nick", "L","Vangundy"));
    	people.add(new Person("Connor", "R","Staton"));
    	people.add(new Person("Hampton", "L","Harben"));
    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }

}