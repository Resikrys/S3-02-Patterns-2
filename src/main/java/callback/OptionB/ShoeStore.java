package callback.OptionB;

public class ShoeStore implements PaymentCallback {

    public void checkout(double amount, PaymentGateway paymentMethod) {
        System.out.println("\nShoe store is starting a payment for a total of $" + amount);
        paymentMethod.processPayment(amount, this); // 'this' se refiere a la instancia de ShoeStore, que es nuestro callback
    }

    @Override
    public void onPaymentSuccess(String message) {
        System.out.println("✅ Payment Result: " + message);
        System.out.println("Purchase completed successfully. Thanks for your business!");
    }

    @Override
    public void onPaymentFailure(String error) {
        System.out.println("❌ Payment Result: " + error);
        System.out.println("Purchase failed. Please try again with a different payment method.");
    }
}
