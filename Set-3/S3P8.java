class Order {
    int orderId, amount;
    Order(int oId, int a){
        orderId = oId;
        amount = a;
    }
}
class OnlineOrder extends Order{
    int deliveryCharge;
    OnlineOrder(int oId, int a, int d){
        super(oId, a);
        deliveryCharge = d;

        System.out.println("Final Bill: "+ (amount+deliveryCharge));
    }
}
public class S3P8 {
    public static void main(String[] args) {
        OnlineOrder o1 = new OnlineOrder(122, 300, 45);
    
    }
}
