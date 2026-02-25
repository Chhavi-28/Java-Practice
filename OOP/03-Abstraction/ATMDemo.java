abstract class ATM {
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    void checkBalance(double amount){
        System.out.println("Current Balance: " + amount);
    }
}
class BankATM extends ATM{
    double balance ;
    BankATM(double balance){
        this.balance = balance;
    }
    @Override
    void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        BankATM myATM = new BankATM(10000);
        myATM.checkBalance(myATM.balance);
        myATM.deposit(5000);
        myATM.withdraw(2000);
        myATM.checkBalance(myATM.balance);
    }
    
}
