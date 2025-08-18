package callback.OptionC.payments;

public class PaymentGateway {
    public boolean executePayment(PaymentMethod method, double amount) {
        System.out.println("\n--- Iniciando transacción a través de la Pasarela de Pagos ---");
        boolean success = method.processPayment(amount); // Invoca el callback y guarda el resultado
        System.out.println("--- Transacción completada por la Pasarela de Pagos ---\n");
        return success;
    }
}
