package Controlador;

import Vista.*;

public class Inicio {
    public static Pincipal inicio=new Pincipal();
    

    public static void ocultar(){inicio.setVisible(false);}
    public static void mostrarIni(){inicio.setVisible(true);}
    
    public static void BtRegistro() {
        ocultar();
        VenRegistros.mostrar();
    }
    public static void BtConsulta(){
        ocultar();
        VenConsultas.mostrar();
    }
    public static void BtActu(){
        ocultar();
        VenActu.mostra();
    }
    public static void BTSalir(){
        System.exit(0);
    }
}
