public class Customer {

    private String name;
    private String surname;
    private String personalId;
    private int newAge;

    // constructor method
    public Customer(int age) {
        newAge = age;
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

    public void setPersonalId(String newPersonalId) {
        this.personalId = newPersonalId;
        System.out.println("Personal Id: " + newPersonalId);
    }

    public void age() {
        System.out.println("Age: " + newAge);
    }
}
