package alumno;

public class alumno {
    private String nroLegajo; // obligatorio
    private String nombre; // obligatorio
    private String apellido; // opc
    private String domicilio; // opc

    // constructores
    public alumno(String nroLegajo, String nombre){
        this.nombre = nombre;
        this.setNroLegajo(nroLegajo);
    }

    public alumno(String nroLegajo, String nombre, String unApellido){
        this.nombre = nombre;
        this.nroLegajo = nroLegajo;
        this.apellido = unApellido;
    }

    public alumno(String nroLegajo, String nombre, String unApellido, String unDomicilio){
        this.nombre = nombre;
        this.nroLegajo = nroLegajo;
        this.apellido = unApellido;
        this.domicilio = unDomicilio;
    }

    // Metodos

    public String imprimirAlumno(){
        return "Nombre " + this.nombre + " - Nro Legajo: " + this.nroLegajo;
    }

    public String nota (double nota){
        return nota >= 6 ? "aprobo" : "desaprobo";
    }

    public void mostrarNom(){
        System.out.println("mi nombre es: "+ nombre);
    }
    // get y set

    // alt + ins (autocompletado)

    // set metodo para modificar un atributo
    public void setNroLegajo(String nroLegajo) {
        if(nroLegajo.length() > 5) this.nroLegajo = nroLegajo;
    }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // get retorna el atributo

    public String getNroLegajo() {
        return nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
