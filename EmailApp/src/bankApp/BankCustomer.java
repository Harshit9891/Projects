package bankApp;

public class BankCustomer{

        public String name;
        public String accountNumber;
        public String type;
        public double balance;

        public BankCustomer(String name, String accountNumber, String type, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.type = type;
            this.balance = balance;

            if (this.type.equalsIgnoreCase(name));
        }

        @Override
        public String toString() {
            return (this.name + this.accountNumber+ this.type + this.balance);
        }
    }

