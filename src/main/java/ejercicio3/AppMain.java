package ejercicio3;

public class AppMain {
    public static void main(String []args){

        Archivo archivo1 = new Archivo("archivo", "Los patitos son bonitos");
        Archivo archivo2 = new Archivo("archivo", "Los patitos son bonitos pero lo son más los gatos");
        Archivo archivo3 = new Archivo("archivo", "Los patitos son bonitos incluso si son chiquitos");

        Composite folder1 = new Composite("folder");

        Archivo archivo4 = new Archivo("archivo", "Los michis son adorables");
        Archivo archivo5 = new Archivo("archivo", "Los michis solo muestran afecto a sus dueños");
        Archivo archivo6 = new Archivo("archivo", "Prefiero a los michis");
        Composite folder2 = new Composite("folder");

        folder1.add(archivo1);
        folder1.add(archivo2);
        folder1.add(archivo3);

        folder2.add(archivo4);
        folder2.add(archivo5);
        folder2.add(archivo6);

        Composite unidadDisco = new Composite("Unidad de disco");
        unidadDisco.add(folder1);
        unidadDisco.add(folder2);

        unidadDisco.showInfo();

    }
}

