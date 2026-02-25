interface Payment{
    void pay(double amount);
}
class CreditCards implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCards();
        Payment upi = new UPI();

        creditCard.pay(1000);
        upi.pay(500);
    }
}
