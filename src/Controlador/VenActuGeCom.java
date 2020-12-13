package Controlador;

import Vista.*;
public class VenActuGeCom {
    public static ActuGeCom  Gecom=new ActuGeCom();
    public static void mostra(){Gecom.setVisible(true);}
    public static void ocultar(){Gecom.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenActu.mostra();}
    
}
