package prueba2;

public class PersonajeFactory {

    public static PersonajeFactory gestor;

    private PersonajeFactory(){

    }
    public static PersonajeFactory obtenerGestor(){
        if(gestor == null){
            gestor = new PersonajeFactory();
        }
        return gestor;
    }

    public Personaje obtenerPersonaje(String tipo){
        if(tipo.equalsIgnoreCase("mago")){
            return new PersonajeImplMago();
        } else if (tipo.equalsIgnoreCase("arquero")) {
            return new PersonajeImplArqu();
        }else {
            return new PersonajeImplGuerrero();
        }
    }
}
