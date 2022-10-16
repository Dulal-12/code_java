import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Main {
    public static void main(String[] args)
    {
      try{

          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" , "root" , "");

          CallableStatement cs = con.prepareCall("{call sp_getName(?,?)}");
          cs.setInt(1,2);
          cs.registerOutParameter(2 , Types.VARCHAR);
          cs.execute();
          System.out.println(cs.getString(2));

          cs.close();
          con.close();
      }catch(Exception e){
          e.printStackTrace();
      }
    }
}