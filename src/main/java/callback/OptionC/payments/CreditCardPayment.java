package callback.OptionC.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCardPayment implements PaymentMethod {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardPayment.class);

    private String cardNumber;
    private String cardHolder;
    private String cardDate;
    private int cardCvv;
    private PaymentApi api;

    public CreditCardPayment(String cardNumber, String cardHolder, String cardDate, int cardCvv, PaymentApi api) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardDate = cardDate;
        this.cardCvv = cardCvv;
        this.api = api;
    }

    public CreditCardPayment(String cardNumber, PaymentApi api) {
        this(cardNumber, null, null, 0, api);
    }

    @Override
    public boolean processPayment(double amount) {
        logger.info("💳 Processing Credit Card payment...");
        return api.processCreditCard(cardNumber, amount);
    }
}
