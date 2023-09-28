package libro;

public class main_libro {
    public static void main(String[] args) {

        libro libro1 = new libro("tit_1", "julio", 100, 123);
        libro libro2 = new libro("tit_2", "lucio", 200, 456);
        System.out.println(libro1);
        System.out.println(libro2); // Imprimen automaticamente con la función toString()

        if(libro1.getNum_pag() > libro2.getNum_pag()){
            System.out.println("El 1° libro.libro tiene más páginas");
        }else if(libro1.getNum_pag() < libro2.getNum_pag()) {
            System.out.println("El 2° libro.libro tiene más páginas");
        }else{
            System.out.println("La cantidad de páginas es la misma");
        }
    }
}
