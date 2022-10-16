import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/practice";
        String uName = "root";
        String password = "";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uName,password);

        String query = "insert into info values(?,?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1,4);
        ps.setString(2,"Abdullah");

        int i = ps.executeUpdate();

        System.out.println("row: "+i);
        ps.close();
        con.close();
    }
}