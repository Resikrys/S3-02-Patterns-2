package callback.OptionC;

public class PaypalPayment implements PaymentMethod {
    private String email;
    private PaymentApi api;

    public PaypalPayment(String email, PaymentApi api) {
        this.email = email;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("🅿️ Procesando pago con PayPal...");
        return api.processPaypal(email, amount);
    }
}
