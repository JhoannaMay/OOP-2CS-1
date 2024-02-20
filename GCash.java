public class GCash extends Order implements PaymentMode{
    public GCash() {

    }

    @Override
    public double discRate() {
        return 0.0;
    }
    public GCash(String item, double unitPrice, int quantity, PaymentMode mode){
        super(item, unitPrice,quantity, mode);
    }
}
