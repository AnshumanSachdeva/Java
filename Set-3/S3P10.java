class Recharge{
    int mobNo, planAmount;
}
class DataRecharge extends Recharge{
    int dataLimit;
    DataRecharge(int m, int p, int d){
        mobNo = m;
        planAmount = p;
        dataLimit = d;
    }
    void displayData(){
        System.out.println("Recharge details: ");
        System.out.println("Mobile No.: "+ mobNo);
        System.out.println("planAmount: "+ planAmount);
        System.out.println("dataLimit: "+ dataLimit+" GB");
    }
}

public class S3P10 {
    public static void main(String[] args) {
        DataRecharge d1 = new DataRecharge(123447654, 899, 90);
        d1.displayData();
    }
}
