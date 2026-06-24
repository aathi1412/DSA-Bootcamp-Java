
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sample {
    public static void main(String[] args) throws Exception {
        String sql = "select * from User_Details";

        String url = "jdbc:mysql://localhost:3306/first_db";
        String user = "root";
        String password = "Roronoa@Zoro"; 

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(sql);
        
        
        while(rs.next()) {
            
            int id = rs.getInt("Id");
            String name = rs.getString("UserName");
            int age = rs.getInt("Age");
            String gender = rs.getString("Gender");
            String skill = rs.getString("skill");
            System.out.println("--------------------------------------");
            System.out.print(" | " + id + " | " + name + " | " + age + " | " + gender + " | " + skill + " | ");
            System.out.println();
            
        }
        System.out.println("--------------------------------------");

        con.close();

    }
}
