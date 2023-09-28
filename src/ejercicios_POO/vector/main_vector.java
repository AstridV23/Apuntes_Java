package vector;

import vector.vector;

import java.util.Scanner;
public class main_vector {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int k;

        vector v1 = new vector(1, 2, 3);
        vector vnuevo = new vector(2, 5, 1);

        vector v2 = new vector(0, 0, 0);
        System.out.println(v1.toString());
        System.out.println("ingrese el nro por el que desea multiplicar el vector.vector");
        k = scan.nextInt();
        v1.mult(k, v2);
        v1.sumar(vnuevo);
    }
}