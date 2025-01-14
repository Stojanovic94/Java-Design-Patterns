package observer;

public class TabletDisplay implements WeatherObserver {
    private int temperature;
    private WeatherStation weatherStation;

    public TabletDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("Tablet prikazuje temperaturu: " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
