package Controlador;

import Vista.*;
public class VenConGeTic {
   public static ConGeTi GeTi=new ConGeTi();
   public static void mostrar(){GeTi.setVisible(true);}
   public static void ocultar(){GeTi.setVisible(false);}
    public static void BtInicio(){ocultar();Inicio.mostrarIni();}
    public static void BtAtras(){ocultar();VenConsultas.mostrar();}
}
