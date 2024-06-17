package adapterPattern.paymentService.adapterImpl;

import adapterPattern.paymentService.PaymentAdapter;
import adapterPattern.paymentService.adaptees.Razorpay;

public class RazorpayPaymentAdapter implements PaymentAdapter {
    Razorpay razorpay;
    Integer amount;
    public RazorpayPaymentAdapter(Razorpay razorpay, Integer amount) {
        this.razorpay = razorpay;
        this.amount = amount;
    }

    @Override
    public void pay(String paymentMethod, String paymentId) {
        System.out.println("PaymentMethod: " + paymentMethod);
        System.out.println("PaymentId: " + paymentId);
        if(paymentMethod == "Credit") {
            this.razorpay.creditCardPayment(this.amount);
        } else {
            this.razorpay.debitCardPayment(this.amount);
        }
    }

}
