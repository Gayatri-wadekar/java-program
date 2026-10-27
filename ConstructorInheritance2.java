
class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + interest);
    }
}

public class ConstructorInheritance2{

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(12345, 10000, 5);

        s1.displayBalance();
        s1.calculateInterest();
    }
}


 
 
 
 
 
 
 

 