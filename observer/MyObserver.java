package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyObserver implements PropertyChangeListener {
    public MyObserver(MyModel model) {
        model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
    	System.out.println("Property being changed: " + event.getPropertyName());
        System.out.println("Initial: " + event.getOldValue() + "	Updated: " + event.getNewValue());
    }
}
