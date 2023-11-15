package excepciones;

public class EjemploExcepciones {
    public static void main(String[] args) {
        int result;

        try {
            // Simulamos una condición que puede causar una excepción propia
            lanzarExcepcionPropia();
            result = dividir(6, 0);
            System.out.println("El resultado es: " + result);
        } catch (ExcepcionPropia e) {
            System.out.println("Se ha producido una excepción propia: " + e.getMessage());
        }

        try {
            // Simulamos una condición que puede causar una excepción propia
            result = dividir(6, 0);
            System.out.println("El resultado es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static void lanzarExcepcionPropia() throws ExcepcionPropia {
        // Simulamos una excepción propia lanzando una instancia de ExcepcionPropia
        throw new ExcepcionPropia("Esto es una excepción propia");
    }

    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        // Intentamos dividir
        return numerador / denominador;
    }
}

class ExcepcionPropia extends Exception {
    public ExcepcionPropia(String mensaje) {
        super(mensaje);
    }
}
