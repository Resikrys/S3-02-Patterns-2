package callback.OptionA;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore() {
        this.paymentGateway = new PaymentGateway();
    }

    public void sellShoes(double price, String customerName, PaymentMethod method) {
        System.out.println("\n👟🛍️ " + customerName + ", thank you for your purchase at our shoe store!");
        System.out.println(" Total to pay: " + price + "€");
        paymentGateway.executePayment(method, price);
        System.out.println(" We hope to see you again soon, " + customerName + "!");
    }
}
