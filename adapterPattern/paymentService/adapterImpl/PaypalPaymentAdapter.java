package adapterPattern.paymentService.adapterImpl;

import adapterPattern.paymentService.PaymentAdapter;
import adapterPattern.paymentService.adaptees.Paypal;

public class PaypalPaymentAdapter implements PaymentAdapter{
    Paypal paypal;
    Integer amount;
    public PaypalPaymentAdapter(Paypal paypal, Integer amount) {
        this.paypal = paypal;
        this.amount = amount;
    }

    @Override
    public void pay(String paymentMethod, String paymentId) {
        System.out.println("PaymentMethod: " + paymentMethod);
        System.out.println("PaymentId: " + paymentId);
        if(paymentMethod == "Credit") {
            this.paypal.creditCardPayment(this.amount);
        } else {
            this.paypal.debitCardPayment(this.amount);
        }
    }
}
