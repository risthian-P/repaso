import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CConection {
    static final String DB_url = "jdbc:mysql://localhost/Registro";
    String usuario = "root";
    String contrasena = "root_bas3";

    public void establecerConexion(){
        try {
            Connection conectar = DriverManager.getConnection(DB_url,usuario,contrasena);
            System.out.println("conexion exitosa");
        }
        catch (SQLException e){
            throw new RuntimeException(e);

        }
    }
}
