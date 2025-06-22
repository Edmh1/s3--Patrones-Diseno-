package prueba1;

public class Usuario {

    private String nombre;
    private String confIni;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.confIni = "sms";
    }

    public Usuario(String nombre, String confIni){
        this.nombre = nombre;
        this.confIni = confIni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConfIni() {
        return confIni;
    }

    public void setConfIni(String confIni) {
        this.confIni = confIni;
    }
}
