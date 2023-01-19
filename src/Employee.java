public class Employee {
    int newSalary;
    String newPosition;

    public Employee(int salary, String position) {
        newSalary = salary;
        newPosition = position;
    }

    public enum contractType {
        FULLTIME("Full-Time"), PARTTIME("Part-Time");

        contractType(String s) {
        }
    }


    private String name;
    private String surname;


    // Getter
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
        System.out.println("Name: " + newName);
    }

    public void setSurname(String newSurname) {
        this.name = newSurname;
        System.out.println("Surname: " + newSurname);
    }


    // Create a methods named surname, salary, position

    public void salary() {
        System.out.println("Salary: " + newSalary);
    }

    public void position() {
        System.out.println("Position: " + newPosition);
    }

    public void contractStartDate(String contractStartDate) {
        System.out.println("Contract start date: " + contractStartDate);
    }


    public void contractType() {
        System.out.println("Contract type: " + contractType.FULLTIME);
    }


}
