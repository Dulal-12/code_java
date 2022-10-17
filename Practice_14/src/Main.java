import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws  Exception  {

       String driver = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/practice";
       String uName = "root";
       String password = "";

       //Connection

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url , uName , password);

        String query = "insert into student values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setInt(1,1);
        ps.setString(2,"Dulal");
        ps.setString(3,"cse");

        int i = ps.executeUpdate();
        System.out.println("Row affected: "+i);
        ps.close();
        con.close();
    }
}