package callback.OptionA;

public class BankAccountDebitPayment implements PaymentMethod {
    private String accountNumber;
    private String bankName;

    public BankAccountDebitPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("🏦 Processing bank account debit:");
        System.out.println(" Amount: " + amount + "€");
        System.out.println(" Account Number: " + accountNumber);
        System.out.println(" Bank: " + bankName);
        System.out.println(" Bank debit processed successfully.");
        // This is where the actual logic for communicating with a banking system would go.
    }
}
