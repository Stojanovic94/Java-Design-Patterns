package abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AbstractFactoryPatternTest {
    @Test
    void testModernFurnitureFactory() {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        assertEquals("Sedite na modernu stolicu.", chair.sitOn());
        assertEquals("Koristite moderan sto.", table.use());
    }

    @Test
    void testVictorianFurnitureFactory() {
        FurnitureFactory factory = (FurnitureFactory) new VictorianFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        assertEquals("Sedite na viktorijansku stolicu.", chair.sitOn());
        assertEquals("Koristite viktorijanski sto.", table.use());
    }
}
