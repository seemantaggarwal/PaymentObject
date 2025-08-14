public class UPI implements PaymentMethod {
    private String UPIid;
    public UPI(String UPIid) {
        this.UPIid = UPIid;
    }
    @Override
    public void pay() {
        System.out.println("UPI Pay");
    }
}
