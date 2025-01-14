package factory;

public class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            default:
                throw new IllegalArgumentException("Nepoznat tip transporta: " + type);
        }
    }
}
