package observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ObserverPatternTest {
    @Test
    void testObserverNotification() {
        WeatherStation station = new WeatherStation();
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(station);
        TabletDisplay tabletDisplay = new TabletDisplay(station);

        station.setTemperature(25);

        assertEquals(25, smartphoneDisplay.getTemperature(),
                     "Telefon treba da reflektuje trenutnu temperaturu.");
        assertEquals(25, tabletDisplay.getTemperature(),
                     "Tablet treba da reflektuje trenutnu temperaturu.");
    }

    @Test
    void testObserverRemoval() {
        WeatherStation station = new WeatherStation();
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(station);

        station.removeObserver(smartphoneDisplay);
        station.setTemperature(20);

        assertNotEquals(20, smartphoneDisplay.getTemperature(),
                        "Telefon ne treba da reflektuje promene nakon uklanjanja.");
    }
}
