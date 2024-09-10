package Viikko3.observer_design_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {
private double temperature;
private final List<Observer> observers = new ArrayList<>();
private final Random random = new Random();

public WeatherStation() {
    temperature = random.nextDouble() * 60 - 20;  // Random initial temperature between -20 and 40
}

public void registerObserver(Observer observer) {
    observers.add(observer);
}

public void removeObserver(Observer observer) {
    observers.remove(observer);
}

public void notifyObservers() {
    for (Observer observer : observers) {
        observer.update (temperature);
    }
}

// Simulate temperature change and notify observers
public void changeTemperature() {
    double temperatureChange = random.nextDouble() * 2 - 1;  // Change by -1 to 1 degree
    temperature += temperatureChange;
    if (temperature < -20) {
        temperature = -20;
    } else if (temperature > 40) {
        temperature = 40;
    }
    notifyObservers();  // Notify all observers
}

public double getTemperature() {
    return temperature;
}
}
