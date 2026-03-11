// student details 
// create a class student with data members name and roll no . Use a constructor to initialixe them and display the student  details
public class Student {
    private String name = "";
    private int rollNo;

    Student() {
        name = "Unknown";
        rollNo = 0;
        System.out.println("Name = " + name + " , rollNo = " + rollNo);
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
        System.out.println("Name = " + name + " , rollNo = " + rollNo);

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anshuman", 31);
    }
}
