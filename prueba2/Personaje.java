package prueba2;

public abstract class Personaje implements Cloneable {

    private String nombre;
    private String tipo;
    private String arma;
    private String habilidad;

    public Personaje(){

    }

    public Personaje clonar(){
        Personaje personaje = null;
        try {
            personaje = (Personaje) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
