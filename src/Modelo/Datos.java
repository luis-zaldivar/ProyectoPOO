package Modelo;

public class Datos {
    
    private String nombre,numero;
    
    public Datos(String nombre,String numero){
        this.nombre=nombre;
        this.numero=numero;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
