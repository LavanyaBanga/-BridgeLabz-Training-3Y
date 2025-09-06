public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    
    public static void main(String[] args) {
      
        BankAccount account1 = new BankAccount("Lavanya Banga", "1234567890", 5000.0);

       
        account1.displayBalance();
        System.out.println();

       
        account1.deposit(2000);
        account1.displayBalance();
        System.out.println();

       
        account1.withdraw(1000);
        account1.displayBalance();
        System.out.println();

       
        account1.withdraw(7000);
        account1.displayBalance();
    }
}
