package behavioral.observer.impl;

// zakładamy ze lodowka ma cyfrowy wyswietlacz, ktory wyswietla aktualna temperature
public class FridgeDisplay implements Observer {

    private WeatherStation weatherStation;

    public FridgeDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("LODOWKA: aktulana temperatura otoczenia: " + weatherStation.getTemperature());
    }
}