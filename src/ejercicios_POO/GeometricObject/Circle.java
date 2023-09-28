package ejercicios_POO.GeometricObject;

public class Circle implements GeometricObject{
    double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
