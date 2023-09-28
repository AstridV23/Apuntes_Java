package ejemplosClases;

public class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Rectángulo - Longitud: " + longitud + ", Anchura: " + anchura);
    }
}

