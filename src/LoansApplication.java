
public class LoansApplication {
    public static void main(String[] args) {

        Customer objCustomer = new Customer(30);

        objCustomer.setName("Jonas");
        objCustomer.setSurname("Jonaits");
        objCustomer.setPersonalId("68201185555");
        objCustomer.age();

        Loan myLoan = new Loan();

        myLoan.calculateLoan();


    }
}
