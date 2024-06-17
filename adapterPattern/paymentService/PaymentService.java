package adapterPattern.paymentService;

import adapterPattern.paymentService.adapterImpl.PaypalPaymentAdapter;
import adapterPattern.paymentService.adapterImpl.RazorpayPaymentAdapter;
import adapterPattern.paymentService.adaptees.Paypal;
import adapterPattern.paymentService.adaptees.Razorpay;

public class PaymentService {
    public static void main(String[] args) {
        //Paypal Payment

        Paypal paypal = new Paypal();
        PaypalPaymentAdapter ob = new PaypalPaymentAdapter(paypal, Integer.valueOf(1000));
        ob.pay("Credit", "xyzabcd");
        ob.pay("Debit", "xyzxyzabcd");

        //Razorpay payment

        Razorpay razorpay = new Razorpay();
        RazorpayPaymentAdapter ob1 = new RazorpayPaymentAdapter(razorpay, Integer.valueOf(10000));
        ob1.pay("Credit", "xyzdebcd");
        ob1.pay("Debit", "defghij");
    }
}
