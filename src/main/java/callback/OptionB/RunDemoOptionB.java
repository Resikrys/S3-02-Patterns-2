package callback.OptionB;

public class RunDemoOptionB {
    public void start() {
        ShoeStore myStore = new ShoeStore();

        // Pagar con tarjeta de crédito
        System.out.println("--- Trying to pay with Credit Card ---");
        PaymentGateway creditCard = new CreditCardPayment();
        myStore.checkout(99.99, creditCard);

        // Pagar con PayPal
        System.out.println("\n--- Trying to pay with PayPal ---");
        PaymentGateway paypal = new PaypalPayment();
        myStore.checkout(50.00, paypal);
    }
}
