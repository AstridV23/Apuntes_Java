package CuentasFinal;

public abstract class Cuenta {
    protected int numeroCuenta;
    protected double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
    public abstract String mostrarInformacion();
}

class CuentaPersona extends Cuenta{
    private String nombre;
    private String apellido;

    public CuentaPersona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public CuentaPersona(int numeroCuenta, double saldo, String nombre, String apellido) {
        super(numeroCuenta, saldo);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String mostrarInformacion() {
        return "CuentaPersona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}

class CuentaSociedad extends Cuenta{
    private String nombreEmpresa;
    private String tipoEmpresa;

    public CuentaSociedad(String nombreEmpresa, String tipoEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.tipoEmpresa = tipoEmpresa;
    }

    public CuentaSociedad(int numeroCuenta, double saldo, String nombreEmpresa, String tipoEmpresa) {
        super(numeroCuenta, saldo);
        this.nombreEmpresa = nombreEmpresa;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String mostrarInformacion() {
        return "CuentaSociedad{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", tipoEmpresa='" + tipoEmpresa + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
