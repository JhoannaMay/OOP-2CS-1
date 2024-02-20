public class Maya extends Order implements PaymentMode {
    @Override
    public double discRate() {
        return 0.05;
    }
}
