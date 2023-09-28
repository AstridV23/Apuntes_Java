package Archivos_Directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesDirectorios {
    public static void main(String[] args) {

        // instanciar el archivo dentro del directorio del proyecto
        File archivo = new File("ejemplo_archivo.txt");

        // Imprime la ruta absoluta del archivo, según el proyecto
        System.out.println("Ruta: " + archivo.getAbsoluteFile());

        // devuelve si el archivo existe
        System.out.println("Existe?: "+ archivo.exists());

        // instanciar ruta especifica
        File ruta = new File("C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\Prueba_Files"); // + File.separator + aseguras la compatibilidad con distintos SO

        String[] nombres_archivos = ruta.list(); // lista de lo que existe en la ruta

        for(int i=0; i < nombres_archivos.length; i++){ // imprime la lista
            System.out.println(nombres_archivos[i]);

            File f = new File(ruta.getAbsoluteFile(), nombres_archivos[i]); // representa un archivo o carpeta específica dentro de la carpeta especificada por ruta

            if (f.isDirectory()){ // verifica si es un directorio
                String[] archivos_subcarpeta = f.list(); // lista los subarchivos
                for (int j=0; j < archivos_subcarpeta.length; j++){ // imprime los archivos de las subcarpetas
                    System.out.println(" " + archivos_subcarpeta[j]);
                }
            }
        }

        // crear un directorio
        File directorio = new File("C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\Prueba_Files\\dir_new");
        directorio.mkdir();

        // crear un archivo
        File directorio_archivo = new File("C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\Prueba_Files\\dir_new\\prueba_texto.txt");

        try {
            directorio_archivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Escribir en el archivo
        String archivo_destino = directorio_archivo.getAbsolutePath();
        Escritura accede_es = new Escritura();
        accede_es.escribir(archivo_destino);

        // Eliminar un archivo
        // archivo.delete();
    }
}

class Escritura{
    public void escribir(String ruta_archivo){
        Scanner input = new Scanner(System.in);

        // Crear una cadena de caracteres que se va a escribir en el archivo
        System.out.println("Escribe lo que quieras: ");
        String frase = input.nextLine();

        try {
            // Crear un objeto FileWriter para escribir en el archivo especificado por ruta_archivo
            FileWriter escritura = new FileWriter(ruta_archivo);

            // Iterar a través de los caracteres de la cadena frase y escribirlos en el archivo
            escritura.write(frase);

            /* Otra manera de hacerlo (por caracteres)
            for(int i = 0; i < frase.length(); i++){
                escritura.write(frase.charAt(i));
            }
            */

            // Cerrar el objeto FileWriter para finalizar la escritura en el archivo
            escritura.close();
        }catch (IOException e){
            // Manejar cualquier excepción de tipo IOException que pueda ocurrir durante la escritura
        }finally {
            input.close();
        }
    }
}