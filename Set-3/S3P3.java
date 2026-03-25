class Vehicle {
    int vehicleNo;
    String ownerName;
    Vehicle(int vNo, String oName){
        vehicleNo = vNo;
        ownerName = oName;

    }
}

class Car extends Vehicle  {
    String model, fuelType;
    Car(int vNo, String oName, String m, String f){
        super(vNo, oName);
        model = m;
        fuelType = f;
    }
    void displayData(){
        System.out.println("Vehicle No.:"+ vehicleNo);
        System.out.println("Owner Name:"+ ownerName);
        System.out.println("Model:"+ model);
        System.out.println("Fuel Type:"+ fuelType);
    }
    
}

public class S3P3 {
     public static void main(String[] args) {
        Car c1 = new Car(1, "ABC", "2024", "Petrol");
        c1.displayData();
    }
}
