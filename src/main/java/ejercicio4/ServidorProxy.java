package ejercicio4;

public class ServidorProxy implements IServer{
    private Servidor servidor1;
    private Servidor servidor2;

    public ServidorProxy(String tipo, int capacidad) {
        servidor1 = new Servidor(tipo, capacidad);
        servidor2 = new Servidor("12.0 version", capacidad+16);
    }

    @Override
    public void sendUser(Usuario user, String psw) {
        if(user.getPassword().equals(psw)){
            if(user.isPar()){
                servidor1.sendUser(user, psw);
            }else{
                servidor2.sendUser(user, psw);
            }
        } else{
            System.out.println("Usuario y/o contraseña incorrectos");
        }

    }

    public void showUsers(){
        System.out.println("Lista de usuarios conectados:");
        System.out.println("\t--> Servidor1");
        for(Usuario user: servidor1.getUsuarioList()){
            user.showInfo();
        }
        System.out.println("\n\t--> Servidor2");
        for(Usuario user: servidor2.getUsuarioList()){

            user.showInfo();
        }
    }
}
