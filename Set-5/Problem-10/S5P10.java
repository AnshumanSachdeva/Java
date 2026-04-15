class Student extends Exception {
    int marks[] = { 100, 20, 50, 70, -1 };

    void getData(){
        for (int i = 0; i < 5; i++) {
            try {
                if (marks[i] < 0 || marks[i] > 100) {
                throw new Exception("Marks cant less than 0 and cant greater than 100");
            }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    void getAvg(){
        int s = 0;
        for(int i = 0; i < 5; i++){
            s += marks[i];
        }
        System.out.println("Average: "+ (s/5));
    }
}

public class S5P10 {
    public static void main(String[] args)  {
        Student s1 = new Student();
        s1.getData();
        
    }
}
