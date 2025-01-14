package decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Osnovna kafa";
    }

    @Override
    public double cost() {
        return 50.0;
    }
}
