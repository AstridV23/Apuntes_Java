package producto;

public class producto {
    private String nombre;
    private String origen;
    private double valorUnitario;
    private int cantidadEnStock;

    public producto(String nombre, double valorUnitario) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
    }

    public producto(String nombre, String origen, double valorUnitario, int cantidadEnStock) {
        this.nombre = nombre;
        this.origen = origen;
        this.valorUnitario = valorUnitario;
        this.cantidadEnStock = cantidadEnStock;
    }

    public double getTotalVenta(int cantidadVendida) {
        if (cantidadVendida <= cantidadEnStock) {
            double totalVenta = valorUnitario * cantidadVendida;
            cantidadEnStock -= cantidadVendida;
            return totalVenta;
        } else {
            return cantidadEnStock; // Retorna la cantidad en stock si no hay suficiente para la venta
        }
    }

    // Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

}
