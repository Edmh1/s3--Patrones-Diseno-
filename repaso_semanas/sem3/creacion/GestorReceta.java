package repaso_semanas.sem3.creacion;

import repaso_semanas.sem3.Receta;

public class GestorReceta {

    public static GestorReceta instance;

    private GestorReceta(){}

    public static GestorReceta getInstance() {
        if(instance == null){
            instance = new GestorReceta();
        }
        return instance;
    }
    protected Receta crearReceta(String tipo){
        return new Receta(tipo);
    }
}
