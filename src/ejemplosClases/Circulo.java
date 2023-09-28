package ejemplosClases;

public class Circulo extends FiguraGeometrica implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Círculo - Radio: " + radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo...");
    }
}


