package callback.OptionA;

public class RunDemoOptionA {
    public void start() {
        ShoeStore myShoeStore = new ShoeStore();

        // Customer 1: Pays by credit card
        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "John Doe", "02/27", 123);
        myShoeStore.sellShoes(75.50, "John Doe", creditCard);

        // Customer 2: Pays with PayPal
        PaymentMethod paypal = new PaypalPayment("maria.gonzalez@example.com");
        myShoeStore.sellShoes(120.00, "María González", paypal);

        // Customer 3: Pays by bank debit
        PaymentMethod bankDebit = new BankAccountDebitPayment("ES12345678901234567890", "Fictional Bank");
        myShoeStore.sellShoes(99.99, "Pedro García", bankDebit);
    }
}
