public class Order {

    //variables
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode app; //interface

    //default constructor
    public Order(){
    }

    //constructor
    public Order(String item, double unitPrice, int quantity, PaymentMode app) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.app = app;
        this.totalAmount = totalAmount();
    }

    //setters
    public void setItem(String item) {
        this.item = item;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setMode(PaymentMode app) {
        this.app = app;
    }
    public void setTotalAmount() {
        this.totalAmount = totalAmount();
    }

    //getters
    public String getItem() {
        return item;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public PaymentMode getApp() {
        return app;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    //method to calculate the total amount
    public double totalAmount(){
        double disc = this.unitPrice*this.app.determineDiscountRate();
        double amount = this.unitPrice - disc;
        double total = amount*this.quantity;
        return total;
    }
}