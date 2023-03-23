public class Loan {


    public enum loanType {
        LEASING("leasing"), CONSUMER("consumer");
        loanType(String l) {
        }
    }


    // 	Create two Loans (leasing, consumer loan) objects in LoansApplication and fill out all fields with data.
    int[] id = {1, 2};
    double[] amount = {10000.5, 2350};
    String[] terminationDate = {"2026-07-01", "2024-04-15"};
    double totalAmount = amount[0] + amount[1];


    public void calculateLoan() {

        System.out.println("Loan 1: type " + loanType.LEASING + ", amount " + amount[0] + ", termination date " + terminationDate[0]);
        System.out.println("Loan 2: type " + loanType.CONSUMER + ", amount " + amount[1] + " termination date " + terminationDate[1]);
        System.out.println("Total sum of loans: " + totalAmount);

    }

}
