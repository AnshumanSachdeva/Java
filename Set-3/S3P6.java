class Person{
    String name;
    int age;
}
class Patient extends Person{
    String disease, doctorAssigned;
    Patient(String n, int a, String d, String dr){
        name = n;
        age = a;
        disease = d;
        doctorAssigned = dr;
    }
    void displayData(){
        System.out.println("name of patient: " + name);
        System.out.println("age of patient: " + age);
        System.out.println("disease of patient: " + disease);
        System.out.println("doctorAssigned of patient: " + doctorAssigned);
    }
}
public class S3P6 {
    public static void main(String[] args) {
        Patient p1 = new Patient("BNM", 66, "Cancer", "SDFG");
        p1.displayData();
    }
}
