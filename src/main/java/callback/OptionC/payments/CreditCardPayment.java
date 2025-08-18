package callback.OptionC.payments;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private PaymentApi api;

    public CreditCardPayment(String cardNumber, String cardHolder, PaymentApi api) {
        this.cardNumber = cardNumber;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("💳 Processing Credit Card payment...");
        return api.processCreditCard(cardNumber, amount);
    }
}
