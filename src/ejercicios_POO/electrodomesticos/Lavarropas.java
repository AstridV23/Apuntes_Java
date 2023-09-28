package electrodomesticos;

public class Lavarropas extends Electrodomestico{
    protected double carga;

    protected double cargaPorDefecto = 5;

    public Lavarropas() {
        super();
        this.carga = cargaPorDefecto;
    }
    public Lavarropas(double precio_base, double peso) {
        super(precio_base, peso);
        this.carga = cargaPorDefecto;
    }
    public Lavarropas(double precio_base, String color, String consumo, double peso, double carga) {
        super(precio_base, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        if(this.carga > 30){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
