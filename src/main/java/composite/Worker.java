package composite;

public class Worker implements Employee {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Worker: " + name;
    }
}
