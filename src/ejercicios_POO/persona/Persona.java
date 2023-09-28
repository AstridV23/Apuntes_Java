package persona;

public class Persona {

    // Atributos privados
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int DNI;
    protected char sexo;  // H: hombre, M: mujer
    protected double peso;
    protected double altura;

    // Constante para el sexo por defecto
    private static final char SEXO_POR_DEFECTO = 'H';

    // Constructores
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.apellido = "";
        this.edad = 0;
        this.DNI = dni;
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, String apellido, int edad, int DNI, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
    }
    public Persona(String nombre, String apellido, int edad, int DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos Te4rminar
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }

    // Otros métodos públicos y getters/setters si es necesario

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}



/*

public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("John", "Doe", 30, 'M');
        Persona persona3 = new Persona("Jane", "Smith", 25, "12345678B", 'M', 60.0, 165.0);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }

    private String generarDNI() {
        // Aquí podrías implementar la generación de un DNI válido
        return "12345678A";  // Solo un ejemplo
    }

Ten en cuenta que esta implementación es una versión básica y podría requerir más detalles y funcionalidades según tus necesidades específicas.
constructores (para inicializar datos)
    public persona(String datoDNI){
        DNI = datoDNI;
        nombre = Nombre_por_defecto;
    }
    public persona(String datoDNI, int unaEdad){
        DNI = datoDNI;
        edad = unaEdad;
        nombre = Nombre_por_defecto;
    }
    public persona(String datoDNI, int unaEdad, String unNombre){
        DNI = datoDNI;
        edad = unaEdad;
        nombre = unNombre;
    }

    metodos
    public String comer() {
        return this.nombre + " con DNI " + DNI + " esta comiendo" + ", edad: " + edad;
    }
}
*/