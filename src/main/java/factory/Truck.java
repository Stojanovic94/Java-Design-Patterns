package factory;

public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Dostava kamionom.";
    }
}
