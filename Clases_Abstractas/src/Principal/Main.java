package Principal;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Guardarlos en una colección (usamos List<Object> para permitir cualquier tipo)
        List<Object> coleccion = new ArrayList<>();

        // 1 y 2. Crear varios objetos de animales y frutas asignando sus clases
        coleccion.add(new Tigre());
        coleccion.add(new Pollo());
        coleccion.add(new Manzana());
        coleccion.add(new Naranja());

        System.out.println("============================================");
        System.out.println("   REPORTE DE ANIMALES Y FRUTAS      ");
        System.out.println("============================================\n");

        // 4. Mostrar la información de cada objeto recorriendo la colección
        for (Object item : coleccion) {
            String nombreClase = item.getClass().getSimpleName();
            System.out.println(">> TIPO: " + nombreClase);

            // Si es un Animal, mostramos su sonido característico
            if (item instanceof Animal animal) {
                System.out.println("   Sonido: " + animal.sonido());
            }

            // 5. Identificar cuáles implementan la interfaz Comestible
            if (item instanceof Comestible comestible) {
                // 6. Mostrar cómo se consumen
                System.out.println("   [STATUS]: Es Comestible");
                System.out.println("   [CONSUMO]: " + comestible.comoComer());
            } else {
                System.out.println("   [STATUS]: No es comestible");
            }
            
            System.out.println("--------------------------------------------");
        }
	}

}
