import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        x = sc.nextInt();
        if (x%2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close();
    }
}
