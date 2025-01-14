package builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BuilderPatternTest {
    @Test
    void testStepByStepBuilding() {
        Car car = new CarBuilder()
                .setMake("Tesla")
                .setModel("Model S")
                .setColor("Red")
                .build();

        assertEquals("Tesla", car.getMake(), "Marka automobila treba da je Tesla.");
        assertEquals("Model S", car.getModel(), "Model automobila treba da je Model S.");
        assertEquals("Red", car.getColor(), "Boja automobila treba da je crvena.");
    }

    @Test
    void testDifferentConfigurations() {
        Car car1 = new CarBuilder().setMake("BMW").setModel("X5").build();
        Car car2 = new CarBuilder().setMake("Audi").setModel("Q7").setColor("Black").build();

        assertEquals("BMW", car1.getMake(), "Prvi auto treba da je BMW.");
        assertEquals("Audi", car2.getMake(), "Drugi auto treba da je Audi.");
        assertEquals("Black", car2.getColor(), "Drugi auto treba da je crne boje.");
    }
}
