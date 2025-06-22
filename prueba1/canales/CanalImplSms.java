package prueba1.canales;

import prueba1.Usuario;

public class CanalImplSms implements Canal{
    @Override
    public void enviarNotificacion(String msg, Usuario dest) {
        System.out.println("Se envia mensaje: "+ msg + " (por sms al usuario: "+ dest+")");
    }
}
