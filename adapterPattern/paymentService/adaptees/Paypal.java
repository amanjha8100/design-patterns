package adapterPattern.paymentService.adaptees;

public class Paypal {
    public Paypal() {}

    public void creditCardPayment(Integer amount) {
        System.out.println("Payment Method: " + Paypal.class.getName() + " Paid " + amount + " Type: Credit");
    }

    public void debitCardPayment(Integer amount) {
        System.out.println("Payment Method: " + Paypal.class.getName() + " Paid " + amount + " Type: Debit");
    }
}
