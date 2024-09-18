public class CuentaBancaria {
    String nombre;
    String apellidos;
    int numeroCuenta;
    enum tipoCuenta {AHORROS, CORRIENTE}
    tipoCuenta cuenta;
    double saldo = 0;

    public CuentaBancaria(String nombre, String apellidos, int numeroCuenta, CuentaBancaria.tipoCuenta cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.cuenta = cuenta;
        //this.saldo = saldo; NO SE PASA COMO PARAMETRO YA QUE INICIALMENTE ES 0
    }

    void imprimir(){
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("Apellidos del titular: " + apellidos);
        System.out.println("Tipo de cuenta: " + cuenta);
        System.out.println("Saldo de la cuenta: " + saldo);
    }

    void consultarSaldo(){
        System.out.println("Saldo disponible: " + saldo);
    }

    boolean insertarDinero(double ingreso){
        if (ingreso > 0) {
            saldo = saldo + ingreso;
            System.out.println("Se ha ingresado " + ingreso + " en la cuenta. El nuevo saldo es " + saldo);
            return true;
        } else {
            System.out.println("El valor del ingreso debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirarDinero(double retirar){
       if ((retirar > 0) && (retirar <=saldo)){
        saldo = saldo - retirar;
        System.out.println("Se ha retirado " + retirar + " en la cuenta. El nuevo saldo es " + saldo);
        return true;
       } else { 
        System.out.println("El valor a retirar debe ser menor que el saldo actual.");
        return false;
       }
    }
    
}
