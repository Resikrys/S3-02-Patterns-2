package callback.OptionC.payments;

public class PaymentGateway {
    public boolean executePayment(PaymentMethod method, double amount) {
        System.out.println("\n--- Initiating transaction through the Payment Gateway ---");
        boolean success = method.processPayment(amount);
        System.out.println("--- Transaction completed by the Payment Gateway ---\n");
        return success;
    }
}
