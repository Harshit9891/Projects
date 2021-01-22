package bankApp;

public class Main {


        public static void main(String[] args) {


            SavingsAccount saving = new SavingsAccount(0);

            CheckingAccount checking = new CheckingAccount(5);

            BankAccount bank = new BankAccount(500);
            System.out.println(bank.toString());
            System.out.println(bank.getBalance());


        }
}
