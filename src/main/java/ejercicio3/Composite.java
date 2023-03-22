package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    List<Component> componentList = new ArrayList<>();
    public Composite(String tipo) {
        super(tipo);
        setCantidad(0);
    }

    @Override
    public void showInfo() {
        System.out.println("--> " + getTipo());
        int contador = 0;
        for(Component component: componentList){
            contador+= component.getCantidad();

            component.showInfo();
        }
        System.out.println("\t- N° de palabras: " + getCantidad() + "\n");
    }

    @Override
    public void add(Component composite) {
        componentList.add(composite);
        setCantidad(getCantidad()+ composite.getCantidad());
    }

    @Override
    public void remove(Component composite) {
        setCantidad(getCantidad()- composite.getCantidad());

        componentList.remove(composite);
    }

    @Override
    public Component get(int position) {
        return componentList.get(position);
    }
}
