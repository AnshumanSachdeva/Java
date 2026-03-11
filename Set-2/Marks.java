import java.util.*;
public class Marks {
    private int[] mark = new int [5]; 
    private float a;
    Marks(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
            {
            System.out.println("Enter marks " + i);
            mark[i] = sc.nextInt();
        }
        sc.close();
    }

    void average(){
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s += mark[i];
        }
        a = s/5;
    }
    void display(){
        System.out.println("Average marks: "+ a);
    }
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.average();
        m1.display();
    }
}
