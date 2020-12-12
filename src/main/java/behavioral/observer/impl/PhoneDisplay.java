package behavioral.observer.impl;

public class PhoneDisplay implements Observer {

    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        // rejestracji obserwatora dokonujemy w tym przypadku w konstruktorze
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("TELEFON: aktualna temperatura otoczenia: " + weatherStation.getTemperature());
    }
}
