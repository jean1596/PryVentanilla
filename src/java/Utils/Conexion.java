
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection cn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://autopartes-ventanilla.database.windows.net:1433;database=VENTANILLA_SA","srventanilla","@AD123456");
            System.out.println("Conexion satisfactoria");
        }catch(Exception e){System.out.println("Error de conexion: "+e);}
        return cn;
    }
    

    public static void main(String[] args) {
        Conexion.getConexion();
    }
    
}
