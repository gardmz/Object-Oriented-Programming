package template;


public class Tea extends CaffeineBevarage {

    
    private void addLemon() {
        System.out.println("Adding Lemon");        
    }

    private void steepTeaBag() {
        System.out.println("Steeping The Tea");        
    }

    @Override
    protected void brew() {
        steepTeaBag();
    }

    @Override
    protected void addCondiments() {
        this.addLemon();
    }
}
