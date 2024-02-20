public class ShopeePay extends Order implements PaymentMode {
    public ShopeePay(){

    }

    public ShopeePay(String item, double unitPrice, int quantity, PaymentMode app) {
        super(item, unitPrice, quantity, app);
    }

    @Override
    public double determineDiscountRate() {
        return 0.10;
    }
}
