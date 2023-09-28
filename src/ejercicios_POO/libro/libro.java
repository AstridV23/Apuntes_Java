package libro;

public class libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int num_pag;

    // constructores
    public libro(String tit, String nom_autor, int cant_pag, int num_ISBN){
        titulo = tit;
        autor = nom_autor;
        num_pag = cant_pag;
        ISBN = num_ISBN;
    }

    // get y set

    // set
    public void setISBN(int isbn){ this.ISBN = isbn; }
    public void setTitulo(String tit){ this.titulo = tit; }
    public void setNum_pag(int numPag){ this.num_pag = numPag; }
    public void setAutor(String nomAutor){ this.autor = nomAutor; }

    // get
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNum_pag() { return num_pag; }
    public int getISBN() { return ISBN; }

    // metodos
    public String toString() {
        return "El libro.libro "+titulo+
                " con ISBN: "+ISBN+
                ", creado por "+autor+
                " tiene "+num_pag+" páginas.";
    }


}
