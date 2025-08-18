package callback.OptionA;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String cardDate;
    private int cardCvv;

    public CreditCardPayment(String cardNumber, String cardHolder, String cardDate, int cardCvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardDate = cardDate;
        this.cardCvv = cardCvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("💳 Procesando pago con Tarjeta de Crédito:");
        System.out.println("  Cantidad: " + amount + "€");
        System.out.println("  Número de tarjeta: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("  Titular: " + cardHolder);
        System.out.println("  Fecha caducidad: " + cardDate + ", CVV: " + cardCvv);
        System.out.println("  Pago con Tarjeta de Crédito realizado con éxito.");
        // Aquí iría la lógica real de comunicación con una API de tarjeta de crédito
    }
}
