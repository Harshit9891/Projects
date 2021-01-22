package bankApp;

public class BankAccount {

        protected double balance;

        public BankAccount(double balance){
            this.balance = balance;
        }
        public double withdraw(double amount){
            this.balance -=amount;
            return this.balance;
        }
        public double deposit(double amount){
            this.balance +=amount;
            return this.balance;
        }
        public double getBalance(){
            return this.balance;
        }


}
