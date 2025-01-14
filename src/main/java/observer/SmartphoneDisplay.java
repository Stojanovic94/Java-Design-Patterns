package observer;

public class SmartphoneDisplay implements WeatherObserver {
    private int temperature;

    public SmartphoneDisplay(WeatherStation weatherStation) {
        weatherStation.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("Telefon prikazuje temperaturu: " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
