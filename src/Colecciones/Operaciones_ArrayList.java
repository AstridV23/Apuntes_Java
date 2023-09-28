package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <Integer> miLista = new ArrayList<>();

        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);
        miLista.add(60);

        int n = input.nextInt();

        miLista.add(n);

        int pos = input.nextInt();

        System.out.println("La posición "+pos+" es: "+miLista.get(pos));

        int ind = input.nextInt();

        miLista.remove(ind);

        System.out.println("Lista después de eliminar el elemento de la posición "+ind+":");
        for (int ele : miLista){
            System.out.println(ele);
        }
    }
}
