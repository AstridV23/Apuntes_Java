package excepciones;

public class prueba {

    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (MiExcepcionPersonalizada e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static int dividir(int dividendo, int divisor) throws MiExcepcionPersonalizada {
        if (divisor == 0) {
            throw new MiExcepcionPersonalizada("Divisor no puede ser cero");
        }
        return dividendo / divisor;
    }

}

class MiExcepcionPersonalizada extends Exception { // o RuntimeException si es no comprobada

    public MiExcepcionPersonalizada(){}
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }

    // Puedes añadir constructores adicionales u otros métodos si es necesario.
}