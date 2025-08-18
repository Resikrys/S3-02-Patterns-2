package callback.OptionB;

public class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount, PaymentCallback callback) {
        System.out.println("Processing credit card payment for $" + amount);
        // Simular una operación asíncrona (ej. una llamada a una API real)
        try {
            Thread.sleep(2000); // Simula una demora de 2 segundos
            boolean success = Math.random() > 0.3; // 70% de éxito
            if (success) {
                callback.onPaymentSuccess("Credit card payment successful.");
            } else {
                callback.onPaymentFailure("Credit card payment failed: Insufficient funds.");
            }
        } catch (InterruptedException e) {
            callback.onPaymentFailure("Payment process interrupted.");
        }
    }
}
