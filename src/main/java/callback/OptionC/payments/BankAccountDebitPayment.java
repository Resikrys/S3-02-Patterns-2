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
        System.out.println("🏦 Procesando débito en cuenta bancaria...");
        return api.processBankDebit(accountNumber, amount);
    }
}
