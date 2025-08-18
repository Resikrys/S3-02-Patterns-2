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
        System.out.println("\n👟🛍️ " + customerName + ", ¡gracias por tu compra en nuestra zapatería!");
        System.out.println("  Total a pagar: " + price + "€");
        boolean success = paymentGateway.executePayment(method, price);

        if (success) {
            System.out.println("  ✅ ¡Tu pedido se ha procesado con éxito!");
        } else {
            System.out.println("  ❌ Lo sentimos, ha ocurrido un error con tu pago. Por favor, inténtalo de nuevo.");
        }
        System.out.println("  ¡Esperamos verte de nuevo pronto, " + customerName + "!");
    }
}
