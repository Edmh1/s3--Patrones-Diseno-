package repaso_semanas.sem3;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Receta implements Cloneable{

    private String nombre;
    private String tipo;
    private Duration tiempo;
    private List<String> ingredientes;
    private List<String> instrucciones;

    public Receta(String tipo){
        this.tipo = tipo;
    }

    public Receta clonar(){
        Receta clon = null;
        try {
            clon = (Receta) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clon;
    }

    public void addInstruccion(String instrucion){
        instrucciones.add(instrucion);
    }
    public void addIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Receta receta)) return false;
        return Objects.equals(nombre, receta.nombre) && Objects.equals(tipo, receta.tipo) && Objects.equals(tiempo, receta.tiempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, tiempo);
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

    public Duration getTiempo() {
        return tiempo;
    }

    public void setTiempo(Duration tiempo) {
        this.tiempo = tiempo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(List<String> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
