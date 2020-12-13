package Controlador;

import Vista.*;

public class VenConsultas {

    public static Consultas ventana = new Consultas();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    public static void BtGeCom(){ocultar();VenConGeCom.mostrar();}
    public static void BtGeLog(){ocultar();VenConGeLog.mostrar();}
    public static void BtGeTic(){ocultar();VenConGeTic.mostrar();}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
}
