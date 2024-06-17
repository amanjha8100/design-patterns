package adapterPattern.paymentService.adaptees;

public class Razorpay {
    public Razorpay() {}

    public void creditCardPayment(Integer amount) {
        System.out.println("Payment Method: " + Razorpay.class.getName() + " Paid " + amount + " Type: Credit");
    }

    public void debitCardPayment(Integer amount) {
        System.out.println("Payment Method: " + Razorpay.class.getName() + " Paid " + amount + " Type: Debit");
    }
}
