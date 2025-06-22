package prueba1.canales;

import prueba1.Usuario;

public class CanalImplCorreo implements Canal{
    @Override
    public void enviarNotificacion(String msg, Usuario dest) {
        System.out.println("Se envia mensaje: "+ msg +" (por Correo al usuario: "+ dest+")");
    }
}
