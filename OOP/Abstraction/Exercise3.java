// 3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.



// Main.java file
public class Main {
    public static void main(String[] args) {
        double ibal,damt,wamt;
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount(ibal, "SA001");
        System.out.println("Savings A/c: Initial Balace: $"+ibal);
        damt = 500.00;
        savingsAccount.deposit(damt);
        wamt = 250.00;
        savingsAccount.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount(ibal, "CA001");
        System.out.println("Current A/c: Initial Balace: $"+ibal);
        damt = 2500.00;
        currentAccount.deposit(1000.0);
        wamt = 1250.00;
        currentAccount.withdraw(3000.0);
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);
    }
}

// CurrentAccount.java file
public class CurrentAccount extends BankAccount{

    public CurrentAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() - amount);
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() >= amount){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}

// BankAccount.java file
public abstract class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

// SavingsAccount
public class SavingsAccount extends BankAccount{
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() - amount);
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() >= amount){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}

