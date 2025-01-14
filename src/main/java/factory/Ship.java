package factory;

public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Dostava brodom.";
    }
}
