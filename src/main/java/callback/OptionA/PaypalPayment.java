package callback.OptionA;

public class PaypalPayment implements PaymentMethod {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("🅿️ Procesando pago con PayPal:");
        System.out.println("  Cantidad: " + amount + "€");
        System.out.println("  Email de PayPal: " + email);
        System.out.println("  Redirigiendo a PayPal para la confirmación...");
        System.out.println("  Pago con PayPal realizado con éxito.");
        // Aquí iría la lógica real de comunicación con la API de PayPal
    }
}
