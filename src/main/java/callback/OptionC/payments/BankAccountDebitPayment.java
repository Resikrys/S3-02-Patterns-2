package callback.OptionC.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccountDebitPayment implements PaymentMethod {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardPayment.class);

    private String accountNumber;
    private String bankName;
    private PaymentApi api;

    public BankAccountDebitPayment(String accountNumber, String bankName, PaymentApi api) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        logger.info("🏦 Processing debit to bank account...");
        return api.processBankDebit(accountNumber, amount);
    }
}
