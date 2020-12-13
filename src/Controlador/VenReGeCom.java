package Controlador;

import Vista.*;

public class VenReGeCom {
    public static RegGeCom ventana = new RegGeCom();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    
}
