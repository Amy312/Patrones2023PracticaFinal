package ejercicio1;

public class Escudo extends Habilidad{
    public Escudo(IPersonaje personaje) {
        super(personaje);
        setHabilidad("escudo");

    }


    @Override
    public void existir(){
        super.existir();
        defender();

    }

    private void defender() {
        setpDefensa((int)(getpDefensa()*0.35)+getpDefensa());
        setpArmadura((int)(getpArmadura()*0.1)+getpArmadura());

    }
}
