package callback.OptionC.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class PaymentApi {
    private static final Logger logger = LoggerFactory.getLogger(PaymentApi.class);

    private static final int MIN_DELAY_MS = 1000;
    private static final int MAX_DELAY_MS = 3000;

    public boolean processCreditCard(String cardNumber, double amount) {
        logger.info("💳 API: Connecting to the Credit Card service...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 8) { // 80% success
            logger.info("✅ API: Credit Card Payment Processed.");
            return true;
        } else {
            logger.error("❌ API: Error processing Credit Card payment.");
            return false;
        }
    }

    public boolean processPaypal(String email, double amount) {
        logger.info("🅿️ API: Redirecting to PayPal API...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 9) { // 90% success
            logger.info("✅ API: PayPal payment processed.");
            return true;
        } else {
            logger.error("❌ API: PayPal authentication failed.");
            return false;
        }
    }

    public boolean processBankDebit(String accountNumber, double amount) {
        logger.info("🏦 API: Requesting bank debit...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 7) { // 70% success
            logger.info("✅ API: Bank debit processed.");
            return true;
        } else {
            logger.error("❌ API: Insufficient funds or invalid account.");
            return false;
        }
    }

    private void simulateNetworkDelay() {
        try {
            int delay = new Random().nextInt(MAX_DELAY_MS - MIN_DELAY_MS) + MIN_DELAY_MS;
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Network simulation delay error.");
        }
    }
}
