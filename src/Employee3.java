import java.util.List;

public class Employee3 {
    private String name;
    private Department3 department;

    public Employee3(String name) {
        this.name = name;
    }

    public void setDepartment(Department3 department) {
        if (this.department != null) {
            this.department.removeEmployee(this);
        }
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    public String getName() {
        return name;
    }

    public Department3 getDepartment() {
        return department;
    }

    public List<Employee3> getDepartmentEmployees() {
        return department.getEmployees();
    }

    @Override
    public String toString() {
        if (this == department.getHead()) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.getHead().getName();
        }
    }
}