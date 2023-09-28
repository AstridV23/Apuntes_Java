package CuentasFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GestorCuentas gestorCuentas = new GestorCuentas();

        boolean salir = false;
        int opc;
        int tipoCuenta;
        int numCuenta;

        while (!salir){

            System.out.println("""
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Deseas realizar una operación?
                    1) Crear y agregar cuentas de personas y sociedades.
                    2) Eliminar cuentas de personas y sociedades.
                    3) Editar el saldo de cuentas de personas y sociedades.
                    4) Mostrar la información de todas las cuentas almacenadas.
                    5) Depositar saldo
                    6) Retirar saldo
                    7) Salir
                    
                    """);

            opc = input.nextInt();

            switch (opc){
                case 1: // agregar

                    System.out.println("""
                            Agregar el tipo de cuenta:
                            1) Cuenta Persona
                            2) Cuenta Sociedad
                        """);

                    tipoCuenta = input.nextInt();

                    if(tipoCuenta == 1){

                        System.out.println("Número de cuenta: ");
                        numCuenta = input.nextInt();
                        System.out.println("Saldo: ");
                        double saldo = input.nextDouble();
                        System.out.println("Nombre: ");
                        String nombre = input.nextLine();
                        System.out.println("Apellido: ");
                        String apellido = input.nextLine();

                        CuentaPersona cuentaPersona = new CuentaPersona(numCuenta, saldo, nombre, apellido);

                        gestorCuentas.agregarCuentaPersona(cuentaPersona);

                    } else if (tipoCuenta == 2) {

                        System.out.println("Número de cuenta: ");
                        numCuenta = input.nextInt();
                        System.out.println("Saldo: ");
                        double saldo = input.nextDouble();
                        System.out.println("Nombre de Empresa: ");
                        String nombreEmpresa = input.nextLine();
                        System.out.println("Tipo de Empresa: ");
                        String tipoEmpresa = input.nextLine();

                        CuentaSociedad cuentaSociedad = new CuentaSociedad(numCuenta, saldo, nombreEmpresa, tipoEmpresa);

                        gestorCuentas.agregarCuentaSociedad(cuentaSociedad);

                    }else {
                        System.out.println("ERROR: Opción incorrecta");
                    }

                    break;

                case 2: // eliminar

                    System.out.println("Eliminar cuenta ");

                    System.out.println("Número de cuenta: ");
                    numCuenta = input.nextInt();

                    gestorCuentas.eliminarCuentaPersona(numCuenta);
                    gestorCuentas.eliminarCuentaSociedad(numCuenta);

                    break;

                case 3: // editar

                    System.out.println("Editar cuenta");

                    System.out.println("Número de cuenta: ");
                    numCuenta = input.nextInt();
                    System.out.println("Nuevo saldo: ");
                    double nuevoSaldo = input.nextDouble();

                    gestorCuentas.editarCuentaPersona(numCuenta, nuevoSaldo);
                    gestorCuentas.editarCuentaSociedad(numCuenta, nuevoSaldo);

                    break;

                case 4: // mostrar información

                    gestorCuentas.mostrarTodasLasCuentas();

                    break;

                case 5: // depositar

                    System.out.println("Depositar saldo");

                        System.out.println("Número de cuenta: ");
                        numCuenta = input.nextInt();

                        for(Cuenta c : gestorCuentas.cuentasPersonas){
                            if(c.numeroCuenta == numCuenta){
                                System.out.println("Cantidad: ");
                                double cantidad = input.nextDouble();
                                c.depositar(cantidad);
                            }
                        }
                        
                        for(Cuenta c : gestorCuentas.cuentasSociedad){
                            if(c.numeroCuenta == numCuenta){
                                System.out.println("Cantidad: ");
                                double cantidad = input.nextDouble();
                                c.depositar(cantidad);
                            }
                        }

                    break;

                case 6: // retirar

                    System.out.println("Retirar saldo");

                        System.out.println("Número de cuenta: ");
                        numCuenta = input.nextInt();

                        for(Cuenta c : gestorCuentas.cuentasPersonas){
                            if(c.numeroCuenta == numCuenta){
                                System.out.println("Cantidad: ");
                                double cantidad = input.nextDouble();
                                c.retirar(cantidad);
                            }
                        }
                        for(Cuenta c : gestorCuentas.cuentasSociedad){
                            if(c.numeroCuenta == numCuenta){
                                System.out.println("Cantidad: ");
                                double cantidad = input.nextDouble();
                                c.retirar(cantidad);
                            }
                        }

                    break;

                case 7: // salir

                    salir = true;

                    break;

                default:
                    System.out.println("ERROR: opción incorrecta");
            }
        }
    }
}
