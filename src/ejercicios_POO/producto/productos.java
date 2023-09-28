package producto;

public class productos {
    private String nombre; // obligatorios
    private String origen;
    private String val_unitario;  // obligatorios
    private int cant_stock;

    public static final String sin_origen = "desconocido";
    public static final int cant_por_defecto = 0;

    public productos (String nom, String ori, String val_num, int stock){
        nombre = nom;
        origen = ori;
        val_unitario = val_num;
        cant_stock = stock;
    }

    public productos (String nom, String val_num){
        nombre = nom;
        val_unitario = val_num;
        origen = sin_origen;
        cant_stock = cant_por_defecto;
    }







}
