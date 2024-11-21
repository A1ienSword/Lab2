import java.util.ArrayList;
import java.util.List;

public class Department3 {
    private String name;
    private Employee3 head;
    private List<Employee3> employees;

    public Department3(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void setHead(Employee3 head) {
        this.head = head;
        if (!employees.contains(head)) {
            addEmployee(head);
        }
    }

    public String getName() {
        return name;
    }

    public Employee3 getHead() {
        return head;
    }

    public void addEmployee(Employee3 employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void removeEmployee(Employee3 employee) {
        employees.remove(employee);
    }

    public List<Employee3> getEmployees() {
        return new ArrayList<>(employees);
    }
}