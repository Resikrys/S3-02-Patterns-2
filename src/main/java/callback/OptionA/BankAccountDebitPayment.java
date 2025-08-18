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
        System.out.println("🏦 Procesando débito en cuenta bancaria:");
        System.out.println("  Cantidad: " + amount + "€");
        System.out.println("  Número de cuenta: " + accountNumber);
        System.out.println("  Banco: " + bankName);
        System.out.println("  Débito bancario procesado con éxito.");
        // Aquí iría la lógica real de comunicación con un sistema bancario
    }
}
