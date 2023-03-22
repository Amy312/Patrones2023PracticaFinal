package ejercicio1;

public class Pocion extends Habilidad{
    public Pocion(IPersonaje personaje) {
        super(personaje);
        setHabilidad("poción");

    }

    public void curar(){
        System.out.println("-----------------------\n");
        setpVida(getpVida()+80);
        if(getpVida()>100){setpVida(100);}

    }
    @Override
    public void existir(){
        super.existir();
        curar();
    }


}

