
package futbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    String user="root";
    String pass="123456";
    public Conexion(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            String url="jdbc:mysql://localhost:3306/futbol";
            con = DriverManager.getConnection(url, user, pass);   
        }
        catch(Exception ex){
            System.out.println("ERROR"+ex.getMessage());
        }
    
    }
    public void ejecutarInDeUp(String sql){
        try{
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        }
        catch(Exception ex){
        System.out.println("ERROR"+ex.getMessage());
        }
    
    }
    public void ejecutarSe(String sql){
        try{
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        }
        catch(Exception ex){
        System.out.println("ERROR"+ex.getMessage());
        }
    } 
    public ResultSet getResultSet(){
        return rs;
    }   
}
