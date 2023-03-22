package ejercicio1;

public  class Personaje implements IPersonaje{
    private String nombre;
    private int nivel;
    private Arma arma = null;
    private int pArmadura;
    private int pAtaque;
    private int pDefensa;
    private int pVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.pAtaque = 5;
        this.pArmadura = 5;
        this.pDefensa = 5;
        this.pVida = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getpArmadura() {
        return pArmadura;
    }

    public void setpArmadura(int pArmadura) {
        this.pArmadura = pArmadura;
    }

    public int getpAtaque() {
        return pAtaque;
    }

    public void setpAtaque(int pAtaque) {
        this.pAtaque = pAtaque;
    }

    public int getpDefensa() {
        return pDefensa;
    }

    public void setpDefensa(int pDefensa) {
        this.pDefensa = pDefensa;
    }

    public int getpVida() {
        return pVida;
    }

    public void setpVida(int pVida) {
        this.pVida = pVida;
    }

    public  void existir(){
        System.out.println("Existe el personaje: " + nombre);
    }

    public void showInfo() {
        System.out.println("Personaje: "+ nombre);
        System.out.println("\t- nivel: "+ nivel);
        System.out.println("\t- Ataque: "+ pAtaque);
        System.out.println("\t- Armadura: "+ pArmadura);
        System.out.println("\t- Defensa: "+ pDefensa);
        System.out.println("\t- Vida: "+ pVida);
        if(arma !=null){
            System.out.println("\t- Arma: "+ arma.getTipo());
        }

        System.out.println("-----------------------\n");


    }
}
