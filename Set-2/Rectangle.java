public class Rectangle {
    private float length, breadth, ar;

    Rectangle() {
        length = 1;
        breadth = 1;
    }
    Rectangle(float l, float b){
        length = l;
        breadth = b;
    }
    void area(){
        ar = length * breadth;
    }
    void displayArea(){
        System.out.println("Area of rectangle is: "+ ar);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        r1.area();
        r1.displayArea();
    }
}
