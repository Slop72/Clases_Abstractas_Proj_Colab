package Principal;

public abstract class Fruta implements Comestible {
    protected String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
