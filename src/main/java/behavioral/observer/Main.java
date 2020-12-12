package behavioral.observer;


import behavioral.observer.impl.FridgeDisplay;
import behavioral.observer.impl.Observer;
import behavioral.observer.impl.PhoneDisplay;
import behavioral.observer.impl.WeatherStation;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay(weatherStation);
        Observer fridgeDisplay = new FridgeDisplay(weatherStation);

        // symulujemy zmiane temperatury
        weatherStation.setTemperature(15);
        weatherStation.setTemperature(18);
        weatherStation.setTemperature(25);
    }
}
