package chap07;


import java.util.PrimitiveIterator;

enum Account_Type {
    CHECKING, SAVING;
}
public class Bank_Account {
    private double accountBalance;
    private String accountHolderName;
    private Account_Type account_type;

    public Bank_Account(double accountBalance, String accountHolderName, Account_Type account_type) {
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.account_type = account_type;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccount_type(Account_Type account_type) {
        this.account_type = account_type;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Account_Type getAccount_type() {
        return account_type;
    }
}
class CheckingAccount extends Bank_Account {
    public CheckingAccount(double accountBalance, String accountHolderName, Account_Type account_type) {
        super(accountBalance, accountHolderName, account_type);
    }

    public void deposit (double amount) {
        setAccountBalance(this.getAccountBalance() + amount);
    }

    public void withdraw(double amount) {
        if (amount > this.getAccountBalance()) {
            System.out.println("Error : Insufficient funds.");
        } else if (this.getAccountBalance() - amount < 0) {
            System.out.println("Error: can't have negetive balance.");
        } else {
            setAccountBalance(this.getAccountBalance() - amount);
        }
    }
}

class SavingAccount extends Bank_Account {
    private final int SAVING_ACCOUNT_DAILY_LIMIT = 5;
    int limitCount = 1;
    public SavingAccount(double accountBalance, String accountHolderName, Account_Type account_type) {
        super(accountBalance, accountHolderName, account_type);
    }

    public void deposit (double amount) {
        this.setAccountBalance(this.getAccountBalance() + amount );
    }

    public void withdraw (double amount) {
        if (amount > this.getAccountBalance()) {
            System.out.println("Error: Insufficient funds." );
        } else if (this.getAccountBalance() >= this.getAccountBalance() - amount) {
             if (limitCount <= SAVING_ACCOUNT_DAILY_LIMIT) {
                 this.setAccountBalance(this.getAccountBalance()-amount );
                 limitCount ++ ;
             } else {
                 System.out.println("Your saving account limit is maximum.");
             }
        } else  {
            System.out.println("Error : can't have negetive balance.");
        }
    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000.00, "Mohammad Alamin", Account_Type.SAVING);
        savingAccount.withdraw(10);
        savingAccount.withdraw(50);
        savingAccount.withdraw(100);
        savingAccount.withdraw(150);
        savingAccount.withdraw(40);
        savingAccount.withdraw(500);
    }
}
