package Archivos_Directorios;

import ejemplosClases.Persona;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion { // los obejtos deben implementar en su clase la serializacion
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Juan", 30, 12345678, "Masculino", 175.5, 70.0);
        personas[1] = new Persona("María", 25, 98765432, "Femenino", 162.0, 55.5);
        personas[2] = new Persona("Carlos", 45, 55555555, "Masculino", 180.0, 85.0);
        personas[3] = new Persona("Ana", 28, 11111111, "Femenino", 167.5, 60.0);
        personas[4] = new Persona("Pedro", 35, 99999999, "Masculino", 175.0, 75.0);

        // Creamos el canal para guaardar el obj
        // try-catch por si no se puede escribir
        try {
            ObjectOutputStream escrib_fich = new ObjectOutputStream(new FileOutputStream("C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\Prueba_Files\\personas.txt"));

            // Escribe el obj en un archivo
            escrib_fich.writeObject(personas);

            escrib_fich.close();

            // cierre del flujo de escritura

            // Lectura del fichero
            ObjectInputStream leer_fich = new ObjectInputStream(new FileInputStream("C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\Prueba_Files\\personas.txt"));

            // debemos crear una variable del mismo objeto que queremos deserializar
            // debemos hacer un casting de Objet a la clase Personas
            Persona[] personasLeidas = (Persona[]) leer_fich.readObject();

            leer_fich.close();

            for (Persona p : personasLeidas){
                System.out.println(p);
            }

        }catch (Exception e){

        }

    }
}
