package Controlador;

import Vista.*;
import Modelo.*;
import javax.swing.JOptionPane;

public class RegistroInicio {

    public static Fondo f = new Fondo();
    public static Login log = new Login();

    public static void mostrar() {
        f.setVisible(true);
    }

    public static void ocultar() {
        f.setVisible(false);
    }

    public void BTSalir() {
        System.exit(0);
    }

    public static void BtInicio(String Usu, String contra) {
        if (Usu.equals(log.getUsu())) {
            if (contra.equals(log.getCont())) {
                ocultar();
                Inicio.mostrarIni();
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");//se muestra una ventana si la contraseña no es correcta
                f.Contra.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario incorrecta");//muestra una ventana con el mensaje de que el usuario es incorrecto
            f.User.setText("");
        }
    }

}
