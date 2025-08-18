package callback.OptionC;

import java.util.Random;

public class PaymentApi {
    private static final int MIN_DELAY_MS = 1000;
    private static final int MAX_DELAY_MS = 3000;

    public boolean processCreditCard(String cardNumber, double amount) {
        System.out.println("💳 API: Conectando con el servicio de Tarjetas de Crédito...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 8) { // 80% de éxito
            System.out.println("✅ API: Pago con Tarjeta de Crédito procesado.");
            return true;
        } else {
            System.out.println("❌ API: Error al procesar el pago con Tarjeta de Crédito.");
            return false;
        }
    }

    public boolean processPaypal(String email, double amount) {
        System.out.println("🅿️ API: Redirigiendo a la API de PayPal...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 9) { // 90% de éxito
            System.out.println("✅ API: Pago con PayPal procesado.");
            return true;
        } else {
            System.out.println("❌ API: Error de autenticación en PayPal.");
            return false;
        }
    }

    public boolean processBankDebit(String accountNumber, double amount) {
        System.out.println("🏦 API: Solicitando débito a la cuenta bancaria...");
        simulateNetworkDelay();
        if (new Random().nextInt(10) < 7) { // 70% de éxito
            System.out.println("✅ API: Débito bancario procesado.");
            return true;
        } else {
            System.out.println("❌ API: Fondos insuficientes o cuenta no válida.");
            return false;
        }
    }

    private void simulateNetworkDelay() {
        try {
            int delay = new Random().nextInt(MAX_DELAY_MS - MIN_DELAY_MS) + MIN_DELAY_MS;
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error en el retardo de la simulación de red.");
        }
    }
}
