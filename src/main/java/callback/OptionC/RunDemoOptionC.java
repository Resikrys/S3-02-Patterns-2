package callback.OptionC;

import callback.OptionC.payments.BankAccountDebitPayment;
import callback.OptionC.payments.CreditCardPayment;
import callback.OptionC.payments.PaymentMethod;
import callback.OptionC.payments.PaypalPayment;

public class RunDemoOptionC {
    public void start() {
        ShoeStore myShoeStore = new ShoeStore();

        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", myShoeStore.paymentApi);
        myShoeStore.sellShoes(75.50, "John Doe", creditCard);

        PaymentMethod paypal = new PaypalPayment("jane.doe@example.com", myShoeStore.paymentApi);
        myShoeStore.sellShoes(120.00, "Jane Doe", paypal);

        PaymentMethod bankDebit = new BankAccountDebitPayment("ES12345678901234567890", "Fictional Bank", myShoeStore.paymentApi);
        myShoeStore.sellShoes(99.99, "Yue Moon", bankDebit);
    }
}
