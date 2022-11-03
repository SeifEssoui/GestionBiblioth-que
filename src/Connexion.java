import java.sql.*;

public class Connexion {
    Connection con =null;
    public static Connection cnxdb() {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bibliotekup","root","");
            System.out.println("connected");
            return con;
             
        }
        catch(Exception e)
        {
            System.out.println(e);
           return null;
        }
         
}
}
