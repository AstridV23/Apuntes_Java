package ejercicios_POO.Circulo;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = "+getRadius()+"]" +
                "color= "+getColor()+
                "\nCircle[area ="+getArea()+"]" +
                "\nCircle[circumference ="+getCircumference()+"]";
    }
}

class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return (2*Math.PI*radius)*height; // area del circulo * height
    }
}




