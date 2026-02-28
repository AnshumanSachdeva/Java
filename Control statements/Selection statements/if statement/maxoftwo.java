import java.util.Scanner;
public class maxoftwo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 1st number: ");
        b = sc.nextInt();

        if (a>b) {
            System.out.println(a+" is greater than "+b);
        } else {
            System.out.println(b+" is greater than "+a);
        }
        sc.close();
    }
}
