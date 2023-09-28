package electrodomesticos;

public class Television extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizadorTDT = false;

    protected int resolucionPorDefecto = 20;

    public Television() {
        super();
        this.resolucion = resolucionPorDefecto;
    }
    public Television(double precio_base, double peso) {
        super(precio_base, peso);
        this.resolucion = resolucionPorDefecto;
    }
    public Television(int resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() { return resolucion; }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        if(this.resolucion > 40) this.precio_base *= 0.3;
        if(this.sintonizadorTDT) this.precio_base += 50;
        return this.precio_base;
    }
}
