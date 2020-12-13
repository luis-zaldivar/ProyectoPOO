package Controlador;

import Vista.*;
public class VenConGeCom {
    public static ConGeCom Gecom=new ConGeCom();
    public static void mostrar(){Gecom.setVisible(true);}
    public static void ocultar(){Gecom.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenConsultas.mostrar();}
}
