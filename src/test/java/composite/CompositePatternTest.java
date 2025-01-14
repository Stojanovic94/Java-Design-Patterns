package composite;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompositePatternTest {
    @Test
    void testSingleEmployeeDetails() {
        Employee worker = new Worker("John");
        assertEquals("Worker: John", worker.getDetails());
    }

    @Test
    void testManagerDetailsWithSubordinates() {
        Manager manager = new Manager("Alice");
        Worker worker1 = new Worker("John");
        Worker worker2 = new Worker("Jane");
        manager.addEmployee(worker1);
        manager.addEmployee(worker2);
        String expected = "Manager: Alice\nWorker: John\nWorker: Jane\n";
        assertEquals(expected, manager.getDetails());
    }
}
