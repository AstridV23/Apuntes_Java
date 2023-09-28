package ejemplosClases;

public class Empleado extends Persona {
    private double salario;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con todos los atributos
    public Empleado(String nombre, int edad, int dni, String genero, double salario) {
        super(nombre, edad, dni, genero);
        this.salario = salario;
    }

    // Getter y Setter para el atributo salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser un número positivo");
        }
    }

    // Método para aumentar el sueldo según un porcentaje
    public void aumentarSueldo(double porcentaje) {
        if (porcentaje >= 0) {
            double aumento = salario * (porcentaje / 100);
            salario += aumento;
            System.out.println("El sueldo se ha aumentado en " + aumento + " unidades.");
        } else {
            System.out.println("El porcentaje debe ser un número positivo");
        }
    }

    // Método toString para mostrar la información del empleado
    @Override
    public String toString() {
        return "Empleado [Nombre: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + ", Salario: " + salario + "]";
    }
}
