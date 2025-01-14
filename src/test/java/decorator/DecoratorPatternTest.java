package decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {
    @Test
    void testBasicCoffee() {
        Beverage coffee = new Coffee();
        assertEquals("Osnovna kafa", coffee.getDescription());
        assertEquals(50.0, coffee.cost(), 0.01);
    }

    @Test
    void testCoffeeWithMilkAndSugar() {
        Beverage coffee = new Coffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        assertEquals("Osnovna kafa, mleko, šećer", coffee.getDescription());
        assertEquals(65.0, coffee.cost(), 0.01);
    }
}
