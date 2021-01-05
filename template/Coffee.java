package template;

public class Coffee extends CaffeineBevarage {

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar And Milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void brew() {
        brewCoffeeGrinds();        
    }

    @Override
    protected void addCondiments() {
        addSugarAndMilk();
    }
}