
class Person {
    int age;
    String name;
    Person(int a, String n){
        age = a;
        name = n;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int roll;
    String course;
    Student(int a, String n, int r, String c){
        super(a, n);
        roll = r;
        course = c;
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
    }
}
public class S3P1 {
    public static void main(String[] args) {
        Student s1 = new Student(19, "Anshuman",31, "CSE" );
    }
}