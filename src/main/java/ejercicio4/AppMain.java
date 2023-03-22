package ejercicio4;

public class AppMain {
    public static void main (String []args){
        ServidorProxy servidor = new ServidorProxy("11.5v", 1024);

        servidor.sendUser(new Usuario("uwu12", "Amy", "12345"), "uwu12");
        servidor.sendUser(new Usuario("qwqqwu12", "Julio", "12341"), "uwu12");
        servidor.sendUser(new Usuario("uwwqwqu12", "Ander", "12342"), "uwwqwqu12");
        servidor.sendUser(new Usuario("marcus12", "Marco", "12343"), "marcus12");
        servidor.sendUser(new Usuario("uwu1weqw2", "Jose", "12344"), "uwu1weqw2");
        servidor.sendUser(new Usuario("uwwqwqu12", "Luis", "12349"), "uwwqwqu12");
        servidor.sendUser(new Usuario("uwqu12", "Angel", "12346"), "uwqu12");

        servidor.showUsers();

    }
}

