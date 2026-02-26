class ATMAccount{
    private int pin;
    private double balance;
    private int attempts;
    public ATMAccount(int pin, double balance){
        this.pin = pin;
        this.balance = balance;
        this.attempts = 0;
    }
    public boolean validatePin(int inputPin){
        if(this.pin == inputPin){
            this.attempts = 0; // reset attempts on successful login
            return true;
        } else {
            this.attempts++;
            if(this.attempts >= 3){
                System.out.println("Account locked due to too many failed attempts.");
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (3 - this.attempts));
            }
            return false;
        }
    }
    public void withdraw(double amount , int pin ){
        if(validatePin(pin)){
            if(amount > balance){
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        }
        else {
            System.out.println("Withdrawal failed due to incorrect PIN.");
        }
    }
}


public class ATMEncap {
    public static void main(String[] args) {
        ATMAccount account = new ATMAccount(1234, 1000.0);
        account.withdraw(200, 1234); // Successful withdrawal
        account.withdraw(300, 1111); // Incorrect PIN
        account.withdraw(400, 1111); // Incorrect PIN
        account.withdraw(500, 1111); // Account locked
    }
    
}
