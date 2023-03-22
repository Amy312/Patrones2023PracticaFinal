package ejercicio3;

public abstract class Component {
    private String tipo;
    private int cantidad;

    public Component(String tipo) {
        this.tipo = tipo;


    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    public abstract void showInfo();
    public abstract void add(Component composite);
    public abstract void remove(Component composite);
    public abstract Component get(int position);
}
