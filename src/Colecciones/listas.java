package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class listas {
    public static void main(String[] args) {

        // instaceo
        ArrayList<Integer> lista = new ArrayList<>();
        // los ele se ordenan en base a su llegada
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);

        // para saber cuenatos elementos tiene
        System.out.println("Cantidad de elemntos: "+lista.size());

        // Una forma básica de iterar una lista
        for (int n : lista){
            System.out.println(n);
        }

        System.out.println("Iterator: ");
        // Iteradores
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            int elementoActual = iterator.next();
            System.out.println(elementoActual);
            if(elementoActual == 40){ // Verifica si el elemento actual es igual a 4
                iterator.remove(); // Elimina el elemento actual de la lista
            }
        }

        // Imprime la lista después de eliminar el elemento 4
        System.out.println("Lista después de eliminar el elemento 4:");
        for (int n : lista){
            System.out.println(n);
        }


    }
}
