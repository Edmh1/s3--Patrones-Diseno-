package prueba1;

import prueba1.canales.Canal;
import prueba1.canales.CanalFactory;

public class Prueba1 {
    public static void main(String[] args) {
        /*
    Contexto general:

    Estás desarrollando un sistema de notificaciones internas para una aplicación empresarial.
    Dependiendo del perfil del usuario o su configuración personal, el sistema debe poder enviar
    notificaciones a través de diferentes medios: correo electrónico, mensaje de texto (SMS)
    o notificación bandeja.

    Este sistema será usado en varios módulos del sistema (seguridad, facturación, reportes, etc.),
    por lo tanto debe ser fácilmente reutilizable y mantenible.

    A futuro se quiere poder agregar nuevos canales de notificación (por ejemplo, WhatsApp, Slack),
    sin tener que reescribir la lógica existente del envío de mensajes.

    Además, por eficiencia y simplicidad, se requiere que todo el sistema de mensajería se coordine
    desde un punto central. Es decir, no debe haber múltiples instancias descontroladas encargadas
    de enviar notificaciones en paralelo.

    Tu reto es diseñar las clases necesarias para cumplir con esta funcionalidad, asegurando que:
    - El sistema permita extender los tipos de notificación fácilmente.
    - Los módulos del sistema puedan acceder al sistema de mensajería sin preocuparse por su implementación.
    - La gestión del envío de mensajes esté centralizada y controlada.

    */
        CanalFactory gestor = CanalFactory.obtenerGestor();
        Usuario u1 = new Usuario("pepe");
        Usuario u2 = new Usuario("juan", "correo");

        gestor.obtenerCanal(u1.getConfIni()).enviarNotificacion("hola", u1);
        gestor.obtenerCanal(u2.getConfIni()).enviarNotificacion("hola", u2);

        Seguridad s = new Seguridad();

        s.enviarAlerta(gestor.obtenerCanal(u2.getConfIni()), u2);

    }
}
