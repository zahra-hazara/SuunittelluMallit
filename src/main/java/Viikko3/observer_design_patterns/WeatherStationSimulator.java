package Viikko3.observer_design_patterns;

import Viikko3.observer_design_patterns.CurrentConditionsDisplay;
import Viikko3.observer_design_patterns.StatisticsDisplay;
import Viikko3.observer_design_patterns.WeatherStation;

// Main class
public class WeatherStationSimulator {
    public static void main(String[] args) {
        // Create the WeatherStation (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        // Register observers with the WeatherStation
        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);

        // Simulate some temperature changes
        for (int i = 0; i < 5; i++) {
            weatherStation.changeTemperature();  // Update temperature and notify observers
            try {
                Thread.sleep(1000);  // Pause for 1 second to simulate real-time updates
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Unregister the CurrentConditionsDisplay observer
        weatherStation.removeObserver(currentDisplay);

        System.out.println("\nCurrentConditionsDisplay is removed from observers.\n");

        // Simulate more temperature changes
        for (int i = 0; i < 3; i++) {
            weatherStation.changeTemperature();
            try {
                Thread.sleep(1000);  // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
