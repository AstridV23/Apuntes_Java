package CuentasFinal;

import java.util.ArrayList;

public class GestorCuentas {
    ArrayList<CuentaPersona> cuentasPersonas = new ArrayList<>();
    ArrayList<CuentaSociedad> cuentasSociedad = new ArrayList<>();

    public void agregarCuentaPersona(CuentaPersona cuenta){
        cuentasPersonas.add(cuenta);
    }

    public void agregarCuentaSociedad(CuentaSociedad cuenta){
        cuentasSociedad.add(cuenta);
    }

    public void eliminarCuentaPersona(int numeroCuenta){
        for(CuentaPersona c : cuentasPersonas){
            if(numeroCuenta == c.numeroCuenta){
                cuentasPersonas.remove(c);
            }
        }
    }

    public void eliminarCuentaSociedad(int numeroCuenta){
        for(CuentaSociedad c : cuentasSociedad){
            if(numeroCuenta == c.numeroCuenta){
                cuentasSociedad.remove(c);
            }
        }
    }

    public void editarCuentaPersona(int numCuenta, double nuevoSaldo){
        for(CuentaPersona c : cuentasPersonas){
            if(numCuenta == c.numeroCuenta){
                c.setSaldo(nuevoSaldo);
            }
        }
    }

    public void editarCuentaSociedad(int numCuenta, double nuevoSaldo){
        for(CuentaSociedad c : cuentasSociedad){
            if(numCuenta == c.numeroCuenta){
                c.setSaldo(nuevoSaldo);
            }
        }
    }

    public void mostrarTodasLasCuentas(){
        System.out.println("Cuentas de Personas: ");
        for(CuentaPersona c : cuentasPersonas){
            System.out.println(c.mostrarInformacion());
        }
        System.out.println("Cuentas de Sociedad: ");
        for(CuentaSociedad c : cuentasSociedad){
            System.out.println(c.mostrarInformacion());
        }
    }

}
