class Product {
    int price;
    String name;
}
class Electronics extends Product{
    String warrantyPeriod;
    void getData(int p, String n, String w){
        price = p;
        name = n;
        warrantyPeriod = w;
    }
    void displayData(){
        
        System.out.println("name:"+ name);
        System.out.println("warrantyPeriod:"+ warrantyPeriod);
        System.out.println("price:"+ price);
    }
}

public class S3P4 {
     public static void main(String[] args) {
        Electronics e1 = new Electronics();
        e1.getData(100, "XCVB", "1 year");
        e1.displayData();
    }
}
