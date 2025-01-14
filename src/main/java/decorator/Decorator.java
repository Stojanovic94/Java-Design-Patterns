package decorator;

public abstract class Decorator implements Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
