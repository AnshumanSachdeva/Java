// to show the behaviour of finally
public class S5P6 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is finally block, It will always execute, regardless of exceptions.");
        }
    }
}
