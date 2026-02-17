import java.util.Scanner;
class BankAccount{
    String accountHolderName;
    float balance;
    BankAccount(String accountHolderName , float balance){
        this.accountHolderName =accountHolderName;
        this.balance=balance;
    }
    void deposit(float amount){
        balance = balance + amount;
    }
    void withdraw(float amount){
        if(balance>= amount){
            balance=balance -amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance(){
        System.out.println("Account Holder :" +accountHolderName);
        System.out.println("Balance:"+balance);
    }
    public static void main(String[] args) {
       // BankAccount acc= new BankAccount("Chhavi Nagariya", 100000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String accountHolderName =sc.nextLine();
        System.out.println("\nEnter Your current Balance amount :");
        float balance =sc.nextFloat();
        BankAccount acc = new BankAccount(accountHolderName , balance);
        System.out.println("Enter your deposit amount:");
        float depamt =sc.nextFloat();
        System.out.println("Enter amount you want to withdraw");
        float withdrawamt = sc.nextFloat();
        acc.deposit(depamt);
        acc.withdraw(withdrawamt);
        System.out.println("Your Account Record:\n");
        acc.displayBalance();
    }


}