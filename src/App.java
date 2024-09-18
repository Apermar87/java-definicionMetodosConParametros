public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria c1 = new CuentaBancaria("Pepe", "Pérez Domingo", 123456789, CuentaBancaria.tipoCuenta.AHORROS);

        c1.imprimir();
        c1.insertarDinero(1000);
        c1.consultarSaldo();
        c1.insertarDinero(500);
        c1.retirarDinero(750);
    }
}
