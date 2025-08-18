package callback.OptionA;

public class runDemoOptionA {
    public void start() {
        ShoeStore myShoeStore = new ShoeStore();

        // Cliente 1: Paga con tarjeta de crédito
        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "Juan Pérez", "02/27", 123);
        myShoeStore.sellShoes(75.50, "Juan Pérez", creditCard);

        // Cliente 2: Paga con PayPal
        PaymentMethod paypal = new PaypalPayment("maria.gonzalez@example.com");
        myShoeStore.sellShoes(120.00, "María González", paypal);

        // Cliente 3: Paga con débito en cuenta bancaria
        PaymentMethod bankDebit = new BankAccountDebitPayment("ES12345678901234567890", "Banco Ficticio");
        myShoeStore.sellShoes(99.99, "Pedro García", bankDebit);
    }
}
