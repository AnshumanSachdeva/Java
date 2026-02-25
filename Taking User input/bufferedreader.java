import java.io.*;
public class bufferedreader {
    public static void main(String[] args)throws IOException {
        int x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");

        x = Integer.parseInt(br.readLine()); // Integer.parseInt() yeh function isliye use kiya bcz readLine se jo b cheej read krta hai vo string format mein krta hai, usko dubara integer bnane k liye yeh likha hai
        
        System.out.println("The number is: " + x);
    }
}
