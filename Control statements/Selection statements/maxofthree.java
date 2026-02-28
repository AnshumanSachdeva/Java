import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd no.: ");
        b = sc.nextInt();
        System.out.println("Enter 3rd no.: ");
        c= sc.nextInt();

        if (a>b && a>c) {
            System.out.println("Max no. is : "+a);
        } else if(b>a && b>c){
            System.out.println("Max no. is : "+b);
        } else{
            System.out.println("Max no. is : "+c);
        }

        sc.close();
    }
}
