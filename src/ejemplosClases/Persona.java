package ejemplosClases;

import java.io.Serializable;

public class Persona implements Serializable { // aquellos objetos de esta clase se pueden pasar a bits
    // Atributos privados
    private String nombre;
    private int edad;
    private int dni;
    private String genero;
    private double altura;
    private double peso;

    // Constructor vacío
    public Persona() {}

    // Constructor sin los atributos peso y altura
    public Persona(String nombre, int edad, int dni, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
    }

    // Constructor completo
    public Persona(String nombre, int edad, int dni, String genero, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    // Getter y Setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el atributo edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser un número positivo");
        }
    }

    // Getter y Setter para el atributo DNI
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Getter y Setter para el atributo altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser un número positivo");
        }
    }

    // Getter y Setter para el atributo peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("El peso debe ser un número positivo");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para mostrar información de la persona


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    // Método para determinar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
