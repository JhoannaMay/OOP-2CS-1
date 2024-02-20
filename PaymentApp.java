public class PaymentApp {

    public static void main(String[] args){

        //using GCash payment
        Order gcash = new GCash("keyboard" ,300.0, 10, new GCash());
        System.out.println("Order item is " + gcash.getItem());
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity());

        System.out.println("\nPayment order details if " + gcash.getClass().getSimpleName());
        System.out.println("Discount rate is " + gcash.getMode().discRate());
        System.out.println("Payment amount is " + gcash.getTotalAmount());

        //using Maya
        Order maya = new Maya();
        maya.setItem("keyboard");
        maya.setUnitPrice(300.0);
        maya.setQuantity(10);
        maya.setMode(new Maya());

        System.out.println("\nPayment order details if " + maya.getClass().getSimpleName());
        System.out.println("Discount rate is " + maya.getMode().discRate());
        maya.setTotalAmount();
        System.out.println("Payment amount is " + maya.getTotalAmount());

        Order ShopeePay = new ShopeePay("keyboard", 300.0, 10, new ShopeePay());
        System.out.println("\nPayment order details if " + ShopeePay.getClass().getSimpleName());
        System.out.println("Discount rate is " + ShopeePay.getMode().discRate());
        System.out.println("Payment amount is " + ShopeePay.getTotalAmount());


    }
}

