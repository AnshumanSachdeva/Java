public class Car {
    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    Car() {
        this("Unkown", 200000);
    }

    void display() {
        System.out.println("Brand: "+ brand + " Price: " + price);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
