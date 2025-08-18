package callback.OptionA;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String cardDate;
    private int cardCvv;

    public CreditCardPayment(String cardNumber, String cardHolder, String cardDate, int cardCvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardDate = cardDate;
        this.cardCvv = cardCvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("💳 Processing Credit Card payment:");
        System.out.println(" Amount: " + amount + "€");
        System.out.println(" Card number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println(" Cardholder: " + cardHolder);
        System.out.println(" Expiration date: " + cardDate + ", CVV: " + cardCvv);
        System.out.println(" Credit Card payment successfully completed.");
        // This is where the actual logic for communicating with a credit card API would go.
    }
}
