package callback.OptionA;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore() {
        this.paymentGateway = new PaymentGateway();
    }

    public void sellShoes(double price, String customerName, PaymentMethod method) {
        System.out.println("\n👟🛍️ " + customerName + ", ¡gracias por tu compra en nuestra zapatería!");
        System.out.println("  Total a pagar: " + price + "€");
        paymentGateway.executePayment(method, price);
        System.out.println("  ¡Esperamos verte de nuevo pronto, " + customerName + "!");
    }
}
