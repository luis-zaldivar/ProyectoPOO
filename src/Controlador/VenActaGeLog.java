package Controlador;

import Vista.*;
public class VenActaGeLog {
    public static ActuGeLog GeLog=new ActuGeLog();
    public static void mostrar(){GeLog.setVisible(true);}
    public static void ocultar(){GeLog.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenActu.mostra();}
}
