package callback.OptionA;

public class PaymentGateway {
    public void executePayment(PaymentMethod method, double amount) {
        System.out.println("\n--- Initiating transaction through the Payment Gateway ---");
        method.processPayment(amount); // Invokes the callback
        System.out.println("--- Transaction completed by the Payment Gateway ---\n");
    }
}
