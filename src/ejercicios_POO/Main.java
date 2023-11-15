package ejercicios_POO;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Papel papel = new Papel();
        Birome birome = new Birome(20); 

        String palabra;

        while(birome.cantidadTinta != 1){
            palabra = scanner.nextLine();
            birome.escribir(palabra,papel);
        }

        System.out.println(papel.toString());
    }
}