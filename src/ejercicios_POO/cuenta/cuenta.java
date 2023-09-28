package cuenta;
/*
    Crea una clase llamada Cuenta que tendrá los siguientes atributos:
    1. titular y cantidad (puede tener decimales). Crear sus métodos get, set.
    2. Crear dos constructores que permitan crear una cuenta2.cuenta para un titular y la cantidad.
    Tendrá dos métodos especiales:
    1. ingresar(double cantidad): se ingresa una cantidad a la cuenta2.cuenta, si la cantidad introducida es
    negativa, no se hará nada.
    2. retirar(double cantidad): se retira una cantidad a la cuenta2.cuenta, si restando la cantidad actual a la que
    nos pasan es negativa, la cantidad de la cuenta2.cuenta pasa a ser 0.
*/
public class cuenta {
    private String titular;
    private double cantidad;

    public cuenta(String titular) {
        this.titular = titular;
    }
    public cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if(cantidad >= 0) this.cantidad += cantidad;
    }
    public void retirar(double cantidad){
        if((this.cantidad - cantidad) < 0) this.cantidad = 0;
    }

    public static void main(String[] args) {
        cuenta cuenta1 = new cuenta("Astrid", 1000);
        cuenta1.retirar(3000);
        System.out.println(cuenta1); // Se llama al toString implicitamente
    }
}
