package ejemplosClases;

// Clase abstracta que representa una figura geométrica
public abstract class FiguraGeometrica {
    // Método abstracto para calcular el área de la figura
    public abstract double calcularArea();

    // Método concreto que muestra información general de la figura
    public void mostrarInformacion() {
        System.out.println("Esta es una figura geométrica.");
    }
}
