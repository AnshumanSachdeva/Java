import java.util.Scanner;

public class Stude {
    String name;
    int marks;
    Stude(){
       name = "unknown";
       marks = 0;
    }
    Stude(String n, int m){
        name = n;
        marks = m;
    }
    void display(){
        System.out.println("Name: "+name+" Marks: "+marks);
    }

    public static void main(String[] args) {
        Stude [] std = new Stude [2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < std.length; i++) {
            String n;
            int m;

            System.out.println("Enter Name:");
            n = sc.next();

            System.out.println("Enter Marks:");
            m = sc.nextInt();
            
            std[i] = new Stude(n, m);
        }
        for (int i = 0; i < std.length; i++) {
            std[i].display();
        }
        sc.close();
    }
}
