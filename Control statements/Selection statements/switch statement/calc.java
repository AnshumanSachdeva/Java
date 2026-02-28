import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int x, y, ch, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        x = sc.nextInt();
        System.out.println("Enter value of y");
        y = sc.nextInt();
        System.out.println("Enter your choice (1-4)  \n 1. Add \n 2. Substract \n 3.Multiply \n 4. Divsion");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                op = x + y;
                System.out.println("Sum is: " + op);
                break;
            case 2:
                op = x - y;
                System.out.println("Substraction is: " + op);
                break;
            case 3:
                op = x * y;
                System.out.println("Multiplication is: " + op);
                break;
            case 4:
                op = x / y;
                System.out.println("Division is: " + op);
                break;
            default:
                System.out.println("Try again");
                
        }
        sc.close();;
    }
}
