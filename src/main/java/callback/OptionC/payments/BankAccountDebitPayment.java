package callback.OptionC.payments;

public class BankAccountDebitPayment implements PaymentMethod {
    private String accountNumber;
    private PaymentApi api;

    public BankAccountDebitPayment(String accountNumber, String bankName, PaymentApi api) {
        this.accountNumber = accountNumber;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("🏦 Processing debit to bank account...");
        return api.processBankDebit(accountNumber, amount);
    }
}
