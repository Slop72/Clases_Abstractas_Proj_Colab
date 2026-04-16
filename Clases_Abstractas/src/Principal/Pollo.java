package Principal;

public class Pollo extends Animal implements Comestible  {
	 public Pollo() {
	        super("Pollo");
	    }

	    @Override
	    public String sonido() {
	        return "¡Pio pio! El pollo pia.";
	    }

	    @Override
	    public String comoComer() {
	        return "Pollo: Se puede preparar frito, asado o en caldo.";
	    }
}
