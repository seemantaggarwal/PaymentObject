public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("seemantDC", new DebitCard("seemant", "someName"));
        ps.addPaymentMethod("seemantCC", new CreditCard("seemant", "someName"));
        ps.addPaymentMethod("seemantUPI", new UPI("seemant"));
        ps.addPaymentMethod("seemantWallet", new Wallet());

        ps.makePayment("seemantDC");
        ps.makePayment("seemantCC");
        ps.makePayment("seemantUPI");
        ps.makePayment("seemantWallet");

    }
}
