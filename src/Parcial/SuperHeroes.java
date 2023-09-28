package Parcial;

class Avengers {
    protected boolean persona;

    public Avengers(boolean persona) {
        this.persona = persona;
    }

    public boolean isPersona() {
        return persona;
    }

    public void setPersona(boolean persona) {
        this.persona = persona;
    }
}

class SuperHeroes extends Avengers {
    protected String poder;
    protected String nombre;

    public SuperHeroes(boolean persona) {
        super(persona);
    }

    public SuperHeroes(boolean persona, String poder, String nombre) {
        super(persona);
        this.poder = poder;
        this.nombre = nombre;
    }

    public static void verificarSuperHeroe(boolean esPersona, String poder, String nombre) {
        if (esPersona) {
            new SuperHeroes(esPersona, poder, nombre);
        } else {
            System.out.println("No se puede crear un Super Héroe con valor de persona falso");
        }
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Naves extends Avengers {
    protected String material;
    protected String capacidad;

    public Naves(boolean persona) {
        super(persona);
    }

    public Naves(boolean persona, String material, String capacidad) {
        super(persona);
        this.material = material;
        this.capacidad = capacidad;
    }
    public static void verificarNave(boolean esPersona, String material, String capacidad) {
        if (!esPersona) {
            new Naves(esPersona, material, capacidad);
        } else {
            System.out.println("No se puede crear una Nave con valor de persona verdadero");
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
