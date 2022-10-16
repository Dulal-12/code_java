import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {


      try{

          //create connection
          String Driver = "com.mysql.jdbc.Driver";
          String url = "jdbc:mysql://localhost:3306/practice";
          String userName = "root";
          String password = "";

          Class.forName(Driver);
          Connection con = DriverManager.getConnection(url,userName,password);

          String query = "insert into info values(?,?)";
          PreparedStatement ps = con.prepareStatement(query);
          ps.setInt(1,3);
          ps.setString(2,"Labonno");

          int i = ps.executeUpdate();
          System.out.println("Row : "+i);
          ps.close();
          con.close();


      }catch(Exception e){
          e.printStackTrace();
      }
    }
}