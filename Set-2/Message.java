import java.util.Scanner;

public class Message {
    String msg = "";
    Message(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter messsage:");
        msg = sc.next();
        sc.close();
    }
    void length(){
        System.out.println("Length of the message is: "+ msg.length());
    }
    void upperCase(){
        System.out.println("Uppercase: "+ msg.toUpperCase());
    }
    
    public static void main(String[] args) {
        Message m1 = new Message();
        m1.length();
        m1.upperCase();
    }
}
