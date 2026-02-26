class BankAccount{
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class BankAccountEncapDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Chhavi", 1000.0);
        System.out.println("Initial Balance: " + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        account.withdraw(1500.0); // Attempt to withdraw more than balance
    }

}
