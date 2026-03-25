class Employee{
    String name;
    int baseSalary;
    void getData(String n, int s){
        name = n;
        baseSalary = s;
    }
}
class Manager extends Employee{
    int bonus;
    Manager(int b) {
        bonus = b;
    }
    void displayBonus(){
        System.out.println("Total Salary:" + (baseSalary + bonus) );
    }
}
public class S3P2 {
     public static void main(String[] args) {
        Manager m1 = new Manager(100);
        m1.getData("ABC", 1000);
        m1.displayBonus();
    }
}
