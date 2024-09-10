package Viikko3.observer_design_patterns;

public class StatisticsDisplay implements Observer {
    private double minTemperature = Double.MAX_VALUE;
    private double maxTemperature = Double.MIN_VALUE;

    @Override
    public void update(double temperature) {
        minTemperature = Math.min(minTemperature, temperature);
        maxTemperature = Math.max(maxTemperature, temperature);
        display();
    }

    public void display() {
        System.out.printf("Min temperature: %.1f°C, Max temperature: %.1f°C\n", minTemperature, maxTemperature);
    }
}