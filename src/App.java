public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria c1 = new CuentaBancaria("Pepe", "Pérez Domingo", 123456789, CuentaBancaria.tipoCuenta.AHORROS);
        CuentaBancaria c2 = new CuentaBancaria("Juan", "Gonzalez Huertas", 987654321, CuentaBancaria.tipoCuenta.CORRIENTE);

        c1.imprimir();
        c1.insertarDinero(2000);
        c1.consultarSaldo();
        c1.retirarDinero(750);

        c2.imprimir();
        c2.insertarDinero(500);
        c2.consultarSaldo();

        c1.compararSaldos(c2);
        c1.transferirDinero(c2, 500);


    }
}
