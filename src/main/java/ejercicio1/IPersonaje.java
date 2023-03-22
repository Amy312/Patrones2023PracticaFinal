package ejercicio1;

public interface IPersonaje {
    void existir();
     String getNombre();

     void setNombre(String nombre);

     int getNivel();

     void setNivel(int nivel);

     Arma getArma();

     void setArma(Arma arma);

     int getpArmadura();

     void setpArmadura(int pArmadura);

     int getpAtaque();

     void setpAtaque(int pAtaque);

     int getpDefensa();

     void setpDefensa(int pDefensa);

     int getpVida();

     void setpVida(int pVida);
     void showInfo();
}
