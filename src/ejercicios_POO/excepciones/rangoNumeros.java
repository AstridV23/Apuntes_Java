package excepciones;
import java.util.Scanner;

// rango del 1 al 100
public class rangoNumeros {
    public static void main(String[] args) {
        try{ // posibilidad de error
            Scanner input = new Scanner(System.in);
            System.out.println("Ingresa un número entre el 1 al 100: ");
            int num = input.nextInt();
            examina_error(num); // colisiona si hay error
            System.out.println("Cargado con éxito");// Mensaje de éxito
        }catch (ExcepcionPropia e){ // atrapa el error
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    static void examina_error(int n) throws ExcepcionPropia { // metodo que toma la clase excepcion
        if(n < 1 || n>100){
            throw new ExcepcionPropia("Debe estar dentro del rango [1-100]");
        }
    }
}
class ExcepcionPropia extends Exception { // creación de la excepcion propia
    public ExcepcionPropia() {}
    public ExcepcionPropia(String message) {
        super(message);
    }
}
