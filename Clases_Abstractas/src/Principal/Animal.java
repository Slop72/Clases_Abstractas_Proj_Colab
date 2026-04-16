package Principal;

public abstract class Animal {
	protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que cada animal específico debe implementar.
     */
    public abstract String sonido();
    
    public String getNombre() {
        return nombre;
    }
}
