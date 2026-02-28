import java.util.Scanner;
public class positivenum {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();

        if (x>0) {
            System.out.println("Number is +ve");
        } else if(x<0) {
            System.out.println("Number is -ve");
        } else{
            System.out.println("Number is equal to zero");
        }
        sc.close();
    }
}
