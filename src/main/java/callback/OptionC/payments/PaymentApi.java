package callback.OptionC.payments;

import java.util.Random;

public class PaymentApi {
    private static final int MIN_DELAY_MS = 1000;
    private static final int MAX_DELAY_MS = 3000;

    public boolean processCreditCard(String cardNumber, double amount) {
        System.out.println("💳 API: Connecting to the Credit Card service...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 8) { // 80% success
            System.out.println("✅ API: Credit Card Payment Processed.");
            return true;
        } else {
            System.out.println("❌ API: Error processing Credit Card payment.");
            return false;
        }
    }

    public boolean processPaypal(String email, double amount) {
        System.out.println("🅿️ API: Redirecting to PayPal API...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 9) { // 90% success
            System.out.println("✅ API: PayPal payment processed.");
            return true;
        } else {
            System.out.println("❌ API: PayPal authentication failed.");
            return false;
        }
    }

    public boolean processBankDebit(String accountNumber, double amount) {
        System.out.println("🏦 API: Requesting bank debit...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 7) { // 70% success
            System.out.println("✅ API: Bank debit processed.");
            return true;
        } else {
            System.out.println("❌ API: Insufficient funds or invalid account.");
            return false;
        }
    }

    private void simulateNetworkDelay() {
        try {
            int delay = new Random().nextInt(MAX_DELAY_MS - MIN_DELAY_MS) + MIN_DELAY_MS;
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Network simulation delay error.");
        }
    }
}
