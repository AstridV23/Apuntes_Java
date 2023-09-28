package Colecciones;

import java.util.ArrayList;

public class listas_colecciones {
    public static void main(String[] args) {
        // Declarar e inicializar un ArrayList de enteros
        ArrayList<Integer> listaDeEnteros = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaDeEnteros.add(10);
        listaDeEnteros.add(20);
        listaDeEnteros.add(30);

        // Imprimir el ArrayList
        System.out.println("ArrayList: " + listaDeEnteros);

        // Obtener el tamaño del ArrayList
        int tamaño = listaDeEnteros.size();
        System.out.println("Tamaño del ArrayList: " + tamaño);

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        numeros.remove(1); // Elimina el elemento en el índice 1 (20)

        // Ahora, el ArrayList contiene [10, 30]

        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        colores.remove("verde"); // Elimina el elemento con el valor "verde"

        // Ahora, el ArrayList contiene ["rojo", "azul"]

        ArrayList<Persona> personas = new ArrayList<Persona>();
    }
}
class Persona{
    String nom;
    int edad;

    public Persona() {
    }

    public Persona(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }
}
