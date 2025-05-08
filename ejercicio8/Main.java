package ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cuenta bancaria con saldo inicial de $1000
        Bancos cuenta1 = new Bancos(1000);
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        System.out.print("Elija una opción (1 para depósito, 2 para retiro): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el monto: ");
        float monto = sc.nextFloat();

        // Realizar operación de depósito o retiro según opción elegida
        if (opcion == 1) {
            cuenta1.depositar(monto);
        } else if (opcion == 2) {
            cuenta1.retirar(monto);
        } else {
            System.out.println("Opción no válida.");
        }

        // Mostrar saldo final
        System.out.println("Saldo final: $" + cuenta1.getSaldo());

        sc.close();
    }
}