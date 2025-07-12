package repaso_semanas.sem3.creacion;

import repaso_semanas.sem3.Receta;

public class RecetaBuilder {

    private GestorReceta instance = GestorReceta.getInstance();
    private Receta receta;

    public RecetaBuilder(String tipo){
        receta = instance.crearReceta(tipo);
    }

    public RecetaBuilder setNombre(String nombre){
        receta.setNombre(nombre);
        return this;
    }

    public Receta build(){
        return receta;
    }

}
