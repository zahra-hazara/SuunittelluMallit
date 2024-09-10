package Viikko3.observer_design_patterns;

public class CurrentConditionsDisplay implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + "°C");
    }
}