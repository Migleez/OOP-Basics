
public class EmployeeManager {

    public static void main(String[] args) {
        Employee objEmployee = new Employee(2000, "Manager");

        // Inside class, call methods using . and ():
        objEmployee.setName("Jonas");
        objEmployee.setSurname("Jonaits");
        objEmployee.position();
        objEmployee.contractStartDate("2022-01-01");
        objEmployee.salary();
        objEmployee.contractType();

    }
}
