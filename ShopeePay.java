public class ShopeePay extends Order implements  PaymentMode{
    
    @Override
    public double discRate() {
        return 0.10;
    }
}