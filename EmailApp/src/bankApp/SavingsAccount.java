package bankApp;

public class SavingsAccount  extends BankAccount {


    private final double overDraftLimit = 0;


    public SavingsAccount(double balance) {
        super(balance);  //command n for code

    }
    @Override
    public double withdraw(double amount) {
        if (balance - amount < overDraftLimit) {
            System.out.println("Your withdraw is more" +
                    "than your $" + balance);

        } else {
            balance -= amount;
            System.out.println("Withdraw $ " + amount +
                    "new balance $ " + balance);
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Savings Account";
    }
}




