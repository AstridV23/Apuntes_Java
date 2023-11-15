package ejercicios_POO;

public class Birome {

    int cantidadTinta;

    public Birome(int tinta){
        this.cantidadTinta = tinta;
    }

    public void escribir(String palabra, Papel papel){
        if(cantidadTinta - palabra.length() > 0){
            papel.escribir(palabra);
            this.cantidadTinta -= palabra.length();
        }
        else{
            System.out.println("No hay tinta suficiente para seguir escribiendo.");
            System.out.println(this.cantidadTinta - 1);
        }
    }
}
