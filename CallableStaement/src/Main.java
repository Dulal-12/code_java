import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Main {
    public static void main(String[] args) throws  Exception
    {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/practice";
        String uName = "root";
        String password = "";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uName,password);

        CallableStatement cs = con.prepareCall("{call sp_getName(?,?)}");
        cs.setInt(1,1);
        cs.registerOutParameter(2,Types.VARCHAR);
        cs.execute();

        System.out.println(cs.getString(2));
        cs.close();
        con.close();
    }
}