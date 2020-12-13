package Controlador;

import Vista.*;
public class VenActuGeTi {
    public static ActuGeTi Geti=new ActuGeTi();
    public static void mostrar(){Geti.setVisible(true);}
    public static void ocultar(){Geti.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenActu.mostra();}
}
