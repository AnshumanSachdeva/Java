// handle divide by zero exceptions
class DivideByZeroException extends Exception {
    public DivideByZeroException(String msg) {
        super(msg);
    }
}
public class S5P1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            if (y == 0) {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            int result =  x /y;
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
