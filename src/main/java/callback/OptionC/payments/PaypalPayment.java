package callback.OptionC.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaypalPayment implements PaymentMethod {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardPayment.class);

    private String email;
    private PaymentApi api;

    public PaypalPayment(String email, PaymentApi api) {
        this.email = email;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        logger.info("🅿️ Processing payment with PayPal...");
        return api.processPaypal(email, amount);
    }
}
