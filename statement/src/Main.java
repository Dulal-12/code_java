import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws  Exception{

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/practice";
        String uName = "root";
        String password = "";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uName,password);
        String query = "update info set name='farzana' where id=3";
        Statement st = con.createStatement();
        int i = st.executeUpdate(query);
        System.out.println("row : "+i);
        st.close();
        con.close();
    }
}