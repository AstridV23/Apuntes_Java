package ejemplosClases;

public class Main {
        public static void main(String[] args) {
            FiguraGeometrica circulo = new Circulo(5.0);
            FiguraGeometrica rectangulo = new Rectangulo(4.0, 6.0);

            circulo.mostrarInformacion();
            System.out.println("Área del círculo: " + circulo.calcularArea());
            ((Dibujable) circulo).dibujar(); // Usando la interfaz

            rectangulo.mostrarInformacion();
            System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        }

}
