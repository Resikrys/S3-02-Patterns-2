package callback.OptionC.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentGateway {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardPayment.class);

    public boolean executePayment(PaymentMethod method, double amount) {
        logger.info("\n--- Initiating transaction through the Payment Gateway ---");
        boolean success = method.processPayment(amount);
        logger.info("--- Transaction completed by the Payment Gateway ---\n");
        return success;
    }
}
