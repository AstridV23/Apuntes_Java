package ejercicios_POO.Animales;

interface Volador {
    void volar();
}

public class Animal {
    private String nombre;
    private int edad;

    public Animal() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mover() {
        System.out.println(nombre + " se está moviendo.");
    }

    public void mover(int distancia) {
        System.out.println(nombre + " se ha movido " + distancia + " metros.");
    }

    public void hacerSonido() {
        System.out.println("Hace un sonido genérico.");
    }

    public static int contarAnimales() {
        return 0;
    }
}
