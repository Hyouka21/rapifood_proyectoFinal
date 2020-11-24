package rapifood.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
   
    private final String base = "rapifood_grupo4";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private final String user="root";
    private final String pass="";
    private Connection con;
    
    public Connection getConnection()
    {
        if(con==null)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException |ClassNotFoundException e)
            {   
                JOptionPane.showMessageDialog(null, "Error al conectarse");
                System.err.print(e);
            }
        }
                return con;
    }
}
