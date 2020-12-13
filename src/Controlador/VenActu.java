package Controlador;

import Vista.*;

public class VenActu {
    public static Actualizaciones ventana = new Actualizaciones();
    public static void mostra(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtGecom(){ocultar();VenActuGeCom.mostra();}
    public static void BtGeLog(){ocultar();VenActaGeLog.mostrar();}
    public static void BtGeTi(){ocultar();VenActuGeTi.mostrar();}
}
