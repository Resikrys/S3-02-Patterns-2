package callback.OptionC;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private PaymentApi api; // Inyectamos la dependencia de la API

    public CreditCardPayment(String cardNumber, String cardHolder, PaymentApi api) {
        this.cardNumber = cardNumber;
        this.api = api;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("💳 Procesando pago con Tarjeta de Crédito...");
        return api.processCreditCard(cardNumber, amount);
    }
}
