package callback.OptionB;

public interface PaymentGateway {
    void processPayment(double amount, PaymentCallback callback);
}
