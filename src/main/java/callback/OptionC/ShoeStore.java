package callback.OptionC;

import callback.OptionC.payments.CreditCardPayment;
import callback.OptionC.payments.PaymentApi;
import callback.OptionC.payments.PaymentGateway;
import callback.OptionC.payments.PaymentMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoeStore {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardPayment.class);

    private PaymentGateway paymentGateway;
    PaymentApi paymentApi;

    public ShoeStore() {
        this.paymentApi = new PaymentApi();
        this.paymentGateway = new PaymentGateway();
    }

    public void sellShoes(double price, String customerName, PaymentMethod method) {
        logger.info("\n👟🛍️ " + customerName + ", thank you for your purchase in our shoe store!");
        logger.info(" Total to pay: " + price + "€");
        boolean success = paymentGateway.executePayment(method, price);

        if (success) {
            logger.info(" ✅ Your order has been processed successfully!");
        } else {
            logger.error(" ❌ We're sorry, an error occurred with your payment. Please try again.");
        }
        logger.info(" We hope to see you again soon, " + customerName + "!");
    }
}
