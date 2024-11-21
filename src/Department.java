public class Department {
    private String name;
    private Employee head;

    public Department(String name) {
        this.name = name;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }
}