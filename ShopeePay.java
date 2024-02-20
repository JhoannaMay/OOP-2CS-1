public class ShopeePay extends Order implements PaymentMode {

    public ShopeePay(){

    }
    @Override
    public double discRate() {
        return 0.10;
    }
    public ShopeePay(String item, double unitPrice, int quantity, PaymentMode mode) {
        super(item, unitPrice, quantity, mode);
    }
}
