package decorator;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mleko";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10.0;
    }
}
