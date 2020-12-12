package behavioral.observer.impl;

import java.util.ArrayList;

public class WeatherStation implements Observable {
    private ArrayList<Observer> observers;
    private double temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(c -> c.update());
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
