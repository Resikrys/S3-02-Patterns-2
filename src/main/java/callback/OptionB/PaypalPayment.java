package callback.OptionB;

public class PaypalPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount, PaymentCallback callback) {
        System.out.println("Processing PayPal payment for $" + amount);
        try {
            Thread.sleep(1500);
            boolean success = Math.random() > 0.1; // 90% de éxito
            if (success) {
                callback.onPaymentSuccess("PayPal payment successful.");
            } else {
                callback.onPaymentFailure("PayPal payment failed: Login error.");
            }
        } catch (InterruptedException e) {
            callback.onPaymentFailure("Payment process interrupted.");
        }
    }
}
