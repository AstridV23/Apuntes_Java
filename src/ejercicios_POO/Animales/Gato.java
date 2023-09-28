package ejercicios_POO.Animales;

class Gato extends Animal {
    private String raza;

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un maullido.");
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace ladrido.");
    }
}

class Delfin extends Animal {
    private boolean esMamiferoMarino;

    public Delfin(String nombre, int edad, boolean esMamiferoMarino) {
        super(nombre, edad);
        this.esMamiferoMarino = esMamiferoMarino;
    }

    public boolean isEsMamiferoMarino() {
        return esMamiferoMarino;
    }

    public void setEsMamiferoMarino(boolean esMamiferoMarino) {
        this.esMamiferoMarino = esMamiferoMarino;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " emite sonidos bajo el agua.");
    }
}

class Aguila extends Animal implements Volador {
    private String tipo;

    public Aguila(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un chillido.");
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela alto en el cielo.");
    }
}