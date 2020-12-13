package Controlador;

import Vista.*;
public class VenConGeLog {
    public static ConGeLog Gelog=new ConGeLog();
    public static void mostrar(){Gelog.setVisible(true);}
    public static void ocultar(){Gelog.setVisible(false);}
     public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenConsultas.mostrar();}
}
