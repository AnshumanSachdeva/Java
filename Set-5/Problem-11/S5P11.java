// inner try-catch inside outer

public class S5P11 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught outer exception: " + e.getMessage());
            try {
                int result = 10 / 0; 
            } catch (ArithmeticException ae) {
                System.out.println("Caught inner exception: " + ae.getMessage());
            }
        }
    }
}
