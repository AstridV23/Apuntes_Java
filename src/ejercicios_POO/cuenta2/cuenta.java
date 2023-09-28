package cuenta2;

public class cuenta {

    private String titular;
    private double saldo;

    public static final double SALDO_DEFECTO = 100000;

    public cuenta(String nombre){
        titular = nombre;
        saldo = SALDO_DEFECTO;
    }

    public cuenta(String nombre, double monto){
        titular = nombre;
        saldo = monto;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double ingresar(double monto){
        if(monto > 0){
            saldo += monto;
        }
        return saldo;
    }

    public double retirar(double monto){
        if(monto > saldo){
            saldo = 0;
        }else{
            saldo -= monto;
        }
        return saldo;
    }

    public String imprimirEstado() {
        return "Titular: " +titular+ ", saldo: " +saldo;
    }

    // atajo = Alt + Insert

    @Override
    public String toString() {
        return "cuenta2.cuenta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public boolean tieneMasSaldo(cuenta c){
        if(this.saldo > c.saldo){  // this es la autoreferencia (referencia el receptor del mensaje)
            return true;
        }else{
            return false;
        }
    }

}


