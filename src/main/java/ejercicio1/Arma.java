package ejercicio1;

public class Arma extends Habilidad{
    private String tipo;
    public Arma(IPersonaje personaje, String tipo) {
        super(personaje);
        setHabilidad("arma");
        this.tipo = tipo;
        setArma(this);
        mejorar();


    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void existir(){
        super.existir();

    }

    private void mejorar() {
        setpAtaque((int)(getpAtaque()*0.3)+getpAtaque());
        setNivel(getNivel()*2);

    }
}
