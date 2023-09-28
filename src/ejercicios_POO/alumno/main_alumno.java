package alumno;

import alumno.alumno;

public class main_alumno {
    public static void main(String[] args) {

        alumno alumno1 = new alumno("286109", "julian");
        alumno alumno2 = new alumno("284909", "anabel");
        System.out.println(alumno1.imprimirAlumno());
        System.out.println(alumno2.imprimirAlumno());

        alumno1.setNroLegajo("789034");
        System.out.println(alumno1.getNombre());

        System.out.println("El alumno " + alumno1.nota(2));
    }
}
