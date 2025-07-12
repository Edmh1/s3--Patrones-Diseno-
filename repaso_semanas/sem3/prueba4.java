package repaso_semanas.sem3;

import repaso_semanas.sem3.creacion.RecetaBuilder;

public class prueba4 {
    public static void main(String[] args) {
        Receta re = new RecetaBuilder("postre")
                .setNombre("pastel").build();

    }
}
