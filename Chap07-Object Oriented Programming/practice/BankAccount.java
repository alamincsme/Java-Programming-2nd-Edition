package chap07;


enum AccountType {
    CHECKING, SAVING, SUPER_SAVING;
}
public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;
    private AccountType accountType;

    public BankAccount(int accountNumber, double accountBalance, String accountHolderName, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public void deposit (double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.accountBalance ) {
            System.out.println("Error: Insufficient balance.");
        } else  if (this.accountBalance - amount < 0) {
            System.out.println("Error: can not have negetive balance.");
        } else {
            this.accountBalance -= amount;
        }
    }

    public double checkBalance() {
        return this.accountBalance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(11255,500.00,"Alamin",AccountType.CHECKING);
        account.deposit(150.00);
        System.out.println(account.checkBalance());

        account.withdraw(450);
        System.out.println(account.checkBalance());

    }
}
