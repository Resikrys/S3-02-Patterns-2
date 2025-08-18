package callback.OptionB;

public class RunDemoOptionB {
    public void start() {
        ShoeStore myStore = new ShoeStore();

        // Payment with credit card
        System.out.println("--- Trying to pay with Credit Card ---");
        PaymentGateway creditCard = new CreditCardPayment();
        myStore.checkout(99.99, creditCard);

        // Payment with PayPal
        System.out.println("\n--- Trying to pay with PayPal ---");
        PaymentGateway paypal = new PaypalPayment();
        myStore.checkout(50.00, paypal);
    }
}
