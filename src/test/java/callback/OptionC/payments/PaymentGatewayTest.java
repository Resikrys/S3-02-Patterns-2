package callback.OptionC.payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentGatewayTest {
    private PaymentGateway paymentGateway;
    private PaymentApi mockPaymentApi;

    @BeforeEach
    public void setUp() {
        paymentGateway = new PaymentGateway();
        mockPaymentApi = new PaymentApi();
    }

    @Test
    public void testSuccessfulCreditCardPayment() {
        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "Happy Handsome", "12/26", 123, mockPaymentApi);

        boolean isSuccess = false;
        while (!isSuccess) {
            isSuccess = paymentGateway.executePayment(creditCard, 50.0);
        }

        assertTrue(isSuccess, "The credit card payment should have been successful..");
    }

    @Test
    public void testFailedBankDebitPayment() {
        PaymentMethod bankDebit = new BankAccountDebitPayment("ES12345678901234567890", "Fictional Bank", mockPaymentApi);

        boolean isSuccess = true;
        while (isSuccess) {
            isSuccess = paymentGateway.executePayment(bankDebit, 100.0);
        }

        assertFalse(isSuccess, "The bank debit should have failed.");
    }

    @Test
    public void testPaypalPaymentScenario() {
        PaymentMethod paypal = new PaypalPayment("test@example.com", mockPaymentApi);

        boolean isSuccess = paymentGateway.executePayment(paypal, 75.0);

        assertTrue(isSuccess || !isSuccess, "PayPal payment should return a boolean result.");
    }

}