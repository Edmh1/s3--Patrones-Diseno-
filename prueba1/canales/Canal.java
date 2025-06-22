package prueba1.canales;

import prueba1.Usuario;

public interface Canal {
    void enviarNotificacion(String msg, Usuario dest);
}
