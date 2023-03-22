package ejercicio1;

public class Habilidad implements IPersonaje{
    private IPersonaje personaje;
    private String habilidad;

    public Habilidad(IPersonaje personaje) {
        super();
        this.personaje = personaje;
    }



    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public void existir() {
        personaje.existir();
        System.out.println("--> Habilidad: " + this.habilidad);
    }

    @Override
    public String getNombre() {
        return personaje.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        personaje.setNombre(nombre);
    }

    @Override
    public int getNivel() {
        return personaje.getNivel();
    }

    @Override
    public void setNivel(int nivel) {
        personaje.setNivel(nivel);
    }

    @Override
    public Arma getArma() {
        return personaje.getArma();
    }

    @Override
    public void setArma(Arma arma) {
        personaje.setArma(arma);
    }

    @Override
    public int getpArmadura() {
        return personaje.getpArmadura();
    }

    @Override
    public void setpArmadura(int pArmadura) {
        personaje.setpArmadura(pArmadura);
    }

    @Override
    public int getpAtaque() {
        return personaje.getpAtaque();
    }

    @Override
    public void setpAtaque(int pAtaque) {
        personaje.setpAtaque(pAtaque);
    }

    @Override
    public int getpDefensa() {
        return personaje.getpDefensa();
    }

    @Override
    public void setpDefensa(int pDefensa) {
        personaje.setpDefensa(pDefensa);
    }

    @Override
    public int getpVida() {
        return personaje.getpVida();
    }

    @Override
    public void setpVida(int pVida) {
        personaje.setpVida(pVida);
    }

    @Override
    public void showInfo() {
        personaje.showInfo();
    }
}
