
// handle IOException
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class S5P5 {
    public static void main(String[] args) {
        File f1 = new File("sample.txt");
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
