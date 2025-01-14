package factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactoryPatternTest {
    @Test
    void testFactoryCreatesTruck() {
        Transport transport = TransportFactory.createTransport("truck");
        assertEquals("Dostava kamionom.", transport.deliver());
    }

    @Test
    void testFactoryCreatesShip() {
        Transport transport = TransportFactory.createTransport("ship");
        assertEquals("Dostava brodom.", transport.deliver());
    }

    @Test
    void testUnknownTransportType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TransportFactory.createTransport("plane");
        });
        assertEquals("Nepoznat tip transporta: plane", exception.getMessage());
    }
}
