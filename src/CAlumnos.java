import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CAlumnos {
    public void mostrarAlumnos (JTable paramTablaAlumnos){

        String DB_url = "jdbc:mysql://localhost/Registro";
        String usuario = "root";
        String contrasena = "root_bas3";

        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("edad");
        paramTablaAlumnos.setModel(modelo);
        sql = "Select * from Estudiantes";

        String [] datos = new String[4]; //numero de columnas

        try {
            Connection conectar = DriverManager.getConnection(DB_url,usuario,contrasena);
            Statement st = conectar.createStatement();
            ResultSet re = st.executeQuery(sql);
            while (re.next()){
                datos[0]=re.getString(1);
                datos[1]=re.getString(2);
                datos[2]=re.getString(3);
                datos[3]=re.getString(4);

                modelo.addRow(datos);
            }
            paramTablaAlumnos.setModel(modelo);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
