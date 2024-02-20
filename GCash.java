public class GCash extends Order implements PaymentMode{
    public GCash(){

    }

    public GCash(String item, double unitPrice, int quantity, PaymentMode app){
        super(item, unitPrice,quantity, app);
    }

    @Override
    public double determineDiscountRate() {
        return 10;
    }
}
