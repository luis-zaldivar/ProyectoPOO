package Controlador;

import Vista.*;

public class VenRegGeLog {
    public static RegGeLog ventana = new RegGeLog();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenRegistros.mostrar();}
}
