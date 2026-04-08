class Result {
    protected int marks;
    Result(){
        marks = 0;
    }
    
    int getMarks(){
        return marks;
    }
}
class Admin extends Result {
    void updateMarks(int m){
        marks = m;
    }
}
public class S4P1 {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.updateMarks(85);
        System.out.println("Marks: " + admin.getMarks());
    }
}