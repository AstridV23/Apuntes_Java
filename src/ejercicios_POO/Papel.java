package ejercicios_POO;

public class Papel {

    String texto = "";

    public Papel(){
    }

    public void escribir(String palabra){
        this.texto += palabra + " ";
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
