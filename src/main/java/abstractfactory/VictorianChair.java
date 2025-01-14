package abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public String sitOn() {
        return "Sedite na viktorijansku stolicu.";
    }
}