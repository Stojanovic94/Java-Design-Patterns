package strategy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {
    @Test
    void testDynamicStrategySwitching() {
        PaymentContext context = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(100);
        assertTrue(context.getPaymentMethod() instanceof CreditCardPayment, 
                   "Treba koristiti CreditCardPayment strategiju.");

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(200);
        assertTrue(context.getPaymentMethod() instanceof PayPalPayment, 
                   "Treba koristiti PayPalPayment strategiju.");
    }

    @Test
    void testCreditCardPayment() {
        PaymentStrategy strategy = new CreditCardPayment("9876-5432-1234-5678");
        strategy.pay(100);
    }

    @Test
    void testPayPalPayment() {
        PaymentStrategy strategy = new PayPalPayment("user@example.com");
        strategy.pay(50);
    }
}
