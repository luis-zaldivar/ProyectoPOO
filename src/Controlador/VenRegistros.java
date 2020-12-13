package Controlador;

import Vista.*;

public class VenRegistros {

    public static Registros ventana = new Registros();

    public static void ocultar() {
        ventana.setVisible(false);
    }

    public static void mostrar() {
        ventana.setVisible(true);
    }

    public static void BtGeCom() {
        ocultar();
        VenReGeCom.mostrar();
    }

    public static void BtInico() {
        ocultar();
        Inicio.mostrarIni();
    }

    public static void BtGeLog() {
        ocultar();
        VenRegGeLog.mostrar();
    }

    public static void BtGeTic() {
        ocultar();
        VenReGeTic.mostrar();
    }
}
