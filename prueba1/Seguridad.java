package prueba1;

import prueba1.canales.Canal;

public class Seguridad {

    public Seguridad(){

    }

    public void enviarAlerta(Canal canal, Usuario u){
        canal.enviarNotificacion("Vulnerabilidad", u);
    }
}
