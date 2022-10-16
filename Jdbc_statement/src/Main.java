import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

       try{
           //loading the driver and connection with database
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" , "root" ,"");

           String query = "select * from info";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);

           while(rs.next()){

               System.out.println(rs.getString(2));
           }

           rs.close();
           st.close();
           con.close();

       }catch(Exception e){
           e.printStackTrace();
       }
    }
}