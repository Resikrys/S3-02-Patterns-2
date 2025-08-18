package callback.OptionB;

public interface PaymentCallback {
    void onPaymentSuccess(String message);
    void onPaymentFailure(String error);
}
