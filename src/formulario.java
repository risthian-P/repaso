import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {
    private JPanel rootPanel;
    private JButton guardarButton;
    private JButton modificarButton;
    private JButton verButton;
    private JButton borrarButton;
    private JLabel Formulario;
    private JTextField nombretext;
    private JPasswordField passwordField1;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JCheckBox hombreCheckBox;
    private JCheckBox mujerCheckBox;
    private JTextField idtext;
    private JTable table1;

    private formulario(){
        guardarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CConection objetoConexion = new CConection();
                objetoConexion.establecerConexion();
            }
        });
        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CAlumnos objetoAlumno = new CAlumnos();
                objetoAlumno.mostrarAlumnos(table1);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
