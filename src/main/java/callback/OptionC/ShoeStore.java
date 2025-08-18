package callback.OptionC;

import callback.OptionC.payments.PaymentApi;
import callback.OptionC.payments.PaymentGateway;
import callback.OptionC.payments.PaymentMethod;

public class ShoeStore {
    private PaymentGateway paymentGateway;
    PaymentApi paymentApi;

    public ShoeStore() {
        this.paymentApi = new PaymentApi();
        this.paymentGateway = new PaymentGateway();
    }

    public void sellShoes(double price, String customerName, PaymentMethod method) {
        System.out.println("\n👟🛍️ " + customerName + ", thank you for your purchase in our shoe store!");
        System.out.println(" Total to pay: " + price + "€");
        boolean success = paymentGateway.executePayment(method, price);

        if (success) {
            System.out.println(" ✅ Your order has been processed successfully!");
        } else {
            System.out.println(" ❌ We're sorry, an error occurred with your payment. Please try again.");
        }
        System.out.println(" We hope to see you again soon, " + customerName + "!");
    }
}
