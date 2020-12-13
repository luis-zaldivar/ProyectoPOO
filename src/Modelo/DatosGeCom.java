package Modelo;

public class DatosGeCom extends Datos{
    public String Correo,CURP;
    
    public DatosGeCom(String nombre,String numero,String Correo,String CURP){
        super(nombre,numero);
        this.Correo=Correo;
        this.CURP=CURP;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    
}
