package ejercicio8;

public class Bancos {
    // Atributo con modificador de acceso privado
    private float saldo;

    // Constructor para inicializar el saldo
    public Bancos(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Metodo para obtener el saldo actual
    public float getSaldo() {
        return saldo;
    }

    // Metodo para depositar dinero
    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto de depósito inválido.");
        }
    }

    // MEtodo para retirar dinero
    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto de retiro inválido o saldo insuficiente.");
        }
    }
}
