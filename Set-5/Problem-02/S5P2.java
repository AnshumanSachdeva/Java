// handle invalid array index exceptions (ArrayIndexOutOfBoundsException)
public class S5P2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 10;

        try {
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid array index: " + index);
            }
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
