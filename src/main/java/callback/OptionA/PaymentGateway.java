package callback.OptionA;

public class PaymentGateway {
    public void executePayment(PaymentMethod method, double amount) {
        System.out.println("\n--- Iniciando transacción a través de la Pasarela de Pagos ---");
        method.processPayment(amount); // Invoca el callback
        System.out.println("--- Transacción completada por la Pasarela de Pagos ---\n");
    }
}
