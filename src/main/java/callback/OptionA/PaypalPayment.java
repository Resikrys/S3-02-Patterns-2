package callback.OptionA;

public class PaypalPayment implements PaymentMethod {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("🅿️ Processing PayPal payment:");
        System.out.println(" Amount: " + amount + "€");
        System.out.println(" PayPal Email: " + email);
        System.out.println(" Redirecting to PayPal for confirmation...");
        System.out.println(" PayPal payment successful.");
        // This is where the actual logic for communicating with the PayPal API would go.
    }
}
