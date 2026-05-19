import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "anshuman786");
           

            PreparedStatement ps = con.prepareStatement("INSERT INTO test values('abc', 'abc@gmail.com', 'abc123', 'male', 'JK')");

            int i = ps.executeUpdate();
            if (i>0) {
                 System.out.println("Success");
            } else{
                System.out.println("Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}