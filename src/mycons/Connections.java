package mycons;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Connections 
{
    static Connection con;
    static Statement st;
    public static Statement getConnection()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products",
                "username","password");
        st=con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
        return st;
    }
    public static void closeConnection()
    {
        try{
        st.close();
        con.close();
        }catch(Exception e)
        {}
    }
}
