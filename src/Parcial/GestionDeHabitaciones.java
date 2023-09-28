package Parcial;

import Concesionaria_Vehiculos.Concesionaria;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

interface MostrarInformacion{

}

abstract class Persona{
    private int dni;
    private String nombre;

    public Persona() {
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
}
class Huesped{
    private int numHabitacion;

    public Huesped() {
    }

    public Huesped(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
}
class Habitacion{
    private int cantidadCamas;
    private int capacidadHuespedes;
    private boolean disponible = true;
    ArrayList<Huesped> huespedes = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(int cantidadCamas, int capacidadHuespedes, boolean disponible) {
        this.cantidadCamas = cantidadCamas;
        this.capacidadHuespedes = capacidadHuespedes;
        this.disponible = disponible;
    }

    public void verficarCantHuespedes(){
        if()
    }

    public void reservar(){
        disponible = false;
    }

    public void agregarHuespedes(Huesped huesped){
        huespedes.add(huesped);
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCapacidadHuespedes() {
        return capacidadHuespedes;
    }

    public void setCapacidadHuespedes(int capacidadHuespedes) {
        this.capacidadHuespedes = capacidadHuespedes;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

class GestionDeHabitaciones {
    ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public void cancelarReserva(int numHabitacion){
        habitaciones.get(numHabitacion).setDisponible(true);
    }

    public void guardar(String nombreArchivo) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(this);
            System.out.println("Estado de la concesionaria guardado en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la concesionaria en el archivo " + nombreArchivo);
            e.printStackTrace();
        }
    }

    public void cargar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe en la ruta especificada. Se creará uno nuevo.");
            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            GestionDeHabitaciones habitacionesCargadas = (GestionDeHabitaciones) objectInputStream.readObject();
            this.habitaciones = habitacionesCargadas.habitaciones;

            System.out.println("Estado de la concesionaria cargado desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la concesionaria desde el archivo " + nombreArchivo);
            e.printStackTrace();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String archivo = "C:\\Users\\astri\\Desktop\\GitHub Repositorios\\Apuntes Java\\src\\Parcial\\Hotel.txt";
        int opc;

        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                1. Ver la lista de habitaciones.
                2. Reservar una habitación.
                3. Cancelar una reserva.
                4. Guardar reservas en un archivo.
                5. Cargar reservas desde un archivo.
                6. Salir.
                """);

        opc = input.nextInt();

        switch (opc){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("ERROR. Opción incorrecta");
        }
    }
}
