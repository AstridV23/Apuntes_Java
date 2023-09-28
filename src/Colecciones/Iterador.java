package Colecciones;

import ejemplosClases.Persona;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {
    public static void main(String[] args) {
        // Crear una lista de ArrayList para almacenar las personas
        ArrayList<Persona> personas = new ArrayList<>();

        // Crear y agregar 9 personas a la lista
        personas.add(new Persona("Persona1", 25, 123456789, "Masculino", 170.5, 70.0));
        personas.add(new Persona("Persona2", 30, 987654321, "Femenino", 160.0, 55.0));
        personas.add(new Persona("Persona3", 22, 567890123, "Masculino", 175.0, 80.0));
        personas.add(new Persona("Persona4", 40, 234567890, "Femenino", 165.0, 60.0));
        personas.add(new Persona("Persona5", 19, 345678901, "Masculino", 180.0, 75.0));
        personas.add(new Persona("Persona6", 28, 456789012, "Femenino", 155.0, 50.0));
        personas.add(new Persona("Persona7", 33, 678901234, "Masculino", 172.0, 68.0));
        personas.add(new Persona("Persona8", 21, 789012345, "Femenino", 163.0, 62.0));
        personas.add(new Persona("Persona9", 45, 890123456, "Masculino", 175.5, 85.0));

        // Imprimir la lista de personas (metodo for)
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // metodo con iterador

        // recorrer con iterador

        Iterator<Persona> iterator = personas.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        // eliminar un elemento

        while (iterator.hasNext()){
            Persona persona = iterator.next(); // Obtener el siguiente elemento
            String elementoEliminar = persona.getNombre();
            if (elementoEliminar.equals("Persona8")) {
                iterator.remove();
            }
        }

        System.out.println("Lista luego de eliminar el elemento: ");
        // Imprimir la lista después de eliminar el elemento (método for-each)
        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }
}
