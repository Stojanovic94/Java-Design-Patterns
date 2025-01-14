package decorator;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", šećer";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }
}
