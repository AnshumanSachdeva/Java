class Employee{
    int id;
    protected int sal;
    Employee(){
        id = 1;
        sal = 30000;
        System.out.println("Sal in employee:"+sal);
    }
}

class HR extends Employee{
    HR(){
        System.out.println("Sal in HR:"+sal);
    }
    void changeSal(int s){
        sal = s;
        System.out.println("New salary: "+ sal);
    }
}
class Finance{
    Finance(){
        System.out.println("Finance can't access salary");
    }
}
class Manager extends Employee{
    Manager(){
        System.out.println("Sal in Manager:"+sal);
    }
}
public class S4P6 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        HR h1 = new HR();
        h1.changeSal(45000);
        Finance f1 = new Finance();
        Manager m1 = new Manager();
    }
}
