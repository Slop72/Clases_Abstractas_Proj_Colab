package Principal;

public class Manzana extends Fruta{
	public Manzana() {
        super("Manzana");
    }

    @Override
    public String comoComer() {
        return "Manzana: Se puede comer cruda, en ensalada o como puré.";
    }
}
