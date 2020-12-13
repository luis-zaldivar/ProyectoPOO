package Controlador;

import Vista.*;

public class VenReGeTic {
    public static RegGeTi ventana = new RegGeTi();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    
}
