package electrodomesticos;

public class Electrodomestico {
    protected double precio_base;
    protected String color;
    protected String consumo;
    protected double peso;

    protected static final String colorPorDefecto = "Blanco";
    protected static final String consumoPorDefecto = "F";
    protected static final double precioPorDefecto = 10000;
    protected static final double pesoPorDefecto = 5;

    // Constructores
    public Electrodomestico() {
        this.precio_base = precioPorDefecto;
        this.peso = pesoPorDefecto;
        this.color = colorPorDefecto;
        this.consumo = consumoPorDefecto;
    }
    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.consumo = consumoPorDefecto;
        this.color = colorPorDefecto;
    }
    public Electrodomestico(double precio_base, String color, String consumo, double peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    // get
    public double getPrecio_base() {
        return precio_base;
    }
    public String getColor() {
        return color;
    }
    public String getConsumo() {
        return consumo;
    }
    public double getPeso() {
        return peso;
    }

    // metodos
    public String comprobarConsumoEnergetico(String letra) {
        String[] consumo = {"F", "E", "D", "C", "B", "A"};
        boolean existe = false;
        for (int i = 0; i < 6 || existe == true; i++) {
            if (this.consumo == consumo[i]) {
                existe = true;
            }
        }
        if (existe == false) {
            return consumoPorDefecto;
        } else {
            return letra;
        }

    }
    public String comprobarColor(String color){
        String[] colorValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean existe = false;
        for (int i=0; i<6 || existe == true; i++){
            if(this.color == colorValidos[i]){
                existe = true;
            }
        }
        if(!existe){
            return colorPorDefecto;
        }else{
            return color;
        }
    }
    public double precioFinal(){
        String[] consumo = {"A", "B", "C", "D", "E", "F"};
        int[] aumento = {100, 80, 60, 50, 30, 10};
        for(int i=0; i<consumo.length; i++){
            if(consumo[i].equals(this.consumo)){ //La función equals() se utiliza para comparar cadenas en Java
                this.precio_base += aumento[i];
            }
        }
        if(this.peso <= 19){
            this.precio_base += 10;
        }else if(this.peso <= 49){
            this.precio_base += 50;
        }else if (this.peso <= 79) {
            this.precio_base += 80;
        }else{
            this.precio_base += 100;
        }
        return this.precio_base;
    }
}

