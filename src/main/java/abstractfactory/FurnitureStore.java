package abstractfactory;

public class FurnitureStore {
    private final FurnitureFactory factory;

    public FurnitureStore(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void describeFurniture() {
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        System.out.println(chair.sitOn());
        System.out.println(table.use());
    }
}
