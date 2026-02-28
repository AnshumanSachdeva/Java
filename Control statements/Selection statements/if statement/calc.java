import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        int x,y,ch,op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of y");
        y = sc.nextInt();
        System.out.println("Enter your choice:1-4 \n 1. Add \n 2. Substract \n 3.Multiply \n 4. Divsion");
        ch = sc.nextInt();

        if (ch == 1) {
            op = x+y;
            System.out.println("Sum is: "+ op);
        } else if(ch == 2) {
            op = x-y;
            System.out.println("Substraction is: "+ op);
        } else if(ch == 3){
            op = x*y;
            System.out.println("Multiplication is: "+ op);
        } else if(ch == 4){
            op = x/y;
            System.out.println("Division is: "+ op);
        } else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
