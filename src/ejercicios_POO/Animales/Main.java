package ejercicios_POO.Animales;

public class Main {
    public static void main(String[] args) {
        Gato miGato = new Gato("Garfield", 5, "Persa");
        Perro miPerro = new Perro("Rex", 3, "Labrador");
        Delfin miDelfin = new Delfin("Flipper", 10, true);
        Aguila miAguila = new Aguila("Aquila", 7, "Dorada");

        miGato.hacerSonido();
        miPerro.hacerSonido();
        miDelfin.hacerSonido();
        miAguila.hacerSonido();

        miAguila.volar();
    }
}
