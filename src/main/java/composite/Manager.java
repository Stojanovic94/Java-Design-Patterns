package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Manager: " + name + "\n");
        for (Employee employee : employees) {
            details.append(employee.getDetails()).append("\n");
        }
        return details.toString();
    }
}
