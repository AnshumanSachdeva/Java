import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        x = sc.nextInt();

        System.out.println("The number is: " + x);
        sc.close();
    }
}
