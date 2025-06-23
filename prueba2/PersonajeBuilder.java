package prueba2;

public class PersonajeBuilder {

    private PersonajeFactory gestor = PersonajeFactory.obtenerGestor();
    private Personaje personaje;

    public PersonajeBuilder(String tipo){
        personaje = gestor.obtenerPersonaje(tipo);
        personaje.setTipo(tipo);
    }

    public PersonajeBuilder setNombre(String nombre){
        personaje.setNombre(nombre);
        return this;
    }

    public PersonajeBuilder setArma(String arma){
        personaje.setArma(arma);
        return this;
    }

    public PersonajeBuilder setHabilidad(String habilidad){
        personaje.setHabilidad(habilidad);
        return this;
    }

    public Personaje build(){
        return personaje;
    }
}
