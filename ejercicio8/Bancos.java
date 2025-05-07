package ejercicio8;

public class Bancos {
    public float monto;

    public Bancos(float monto) {
        this.monto = monto;
    }

    public void validarDeposito() {
        if (monto <= 0) {
            System.out.println("Valor no válido para depósito.");
        } else {
            System.out.println("Valor válido.\nPuede depositar su dinero: $" + monto);
        }
    }

    public void validarRetiro() {
        if (monto <= 0) {
            System.out.println("Valor no válido para retiro.");
        } else {
            System.out.println("Valor válido.\nPuede retirar su dinero: $" + monto);
        }
    }
}

