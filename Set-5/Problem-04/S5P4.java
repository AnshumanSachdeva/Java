// multiple catch blocks

public class S5P4 {
    public static void main(String[] args) {
        String str1 = "200";
        String str2 = "abc";

        try {
            int x = Integer.parseInt(str1);
            int y = Integer.parseInt(str2);
            System.out.println("Converted to integer successfully");
            if (y == 0) {
                throw new ArithmeticException("Can't divide by zero");
            }
            System.out.println("Division of " + x + " with " + y + " is: " + (x / y));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
