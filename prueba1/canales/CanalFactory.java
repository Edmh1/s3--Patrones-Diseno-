package prueba1.canales;

public class CanalFactory {

    public static CanalFactory gestor;

    private CanalFactory(){
    }

    public static CanalFactory obtenerGestor(){
        if(gestor == null)
            gestor = new CanalFactory();
        return gestor;
    }

    public Canal obtenerCanal(String canal){
        if (canal.equalsIgnoreCase("bandeja")) {
            return new CanalImplBandeja();
        } else if (canal.equalsIgnoreCase("correo")) {
            return new CanalImplCorreo();
        }else {
            return new CanalImplSms();
        }
    }


}
