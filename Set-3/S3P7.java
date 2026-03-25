class Student {
    String name;
    int marks;
    Student(String n, int m){
        name = n;
        marks = m;
    }
}
class Result extends Student{
    char grade;
    Result(String n, int m, char g ){
        super(n, m);
        grade = g;
    }
    void displayData(){
        System.out.println("name is:"+ name);
        System.out.println("marks is:"+ marks);
        System.out.println("grade is:"+ grade);
    }
}
public class S3P7 {
    public static void main(String[] args) {
        Result r1 = new Result("FGH", 90, 'A');
        r1.displayData();
    }
}
