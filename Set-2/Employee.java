public class Employee {
    private String name, designation;
    private int salary;
    Employee(String n, String d, int s){
        name = n; designation = d; salary = s;
    }    
    void display(){
        System.out.println("Employee information:");
        System.out.println("Name: "+ name);
        System.out.println("Designation: "+ designation);
        System.out.println("Salary: "+ salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Anshuman", "SE", 90000);
        e1.display();
    }
}
