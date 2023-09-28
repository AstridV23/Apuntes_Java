package fraccion;

public class fraccion {
    public double dividendo;
    public double divisor;

    // constructor
    public fraccion(double D, double d){
        dividendo = D;
        divisor = d;
    }

    // metodos

    public String toString() {
        return dividendo+"/"+divisor;
    }
}
