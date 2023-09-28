package Concesionaria_Vehiculos;

public interface Serializable extends java.io.Serializable{
    void guardar(String nombreArchivo);
    void cargar(String nombreArchivo);
}
