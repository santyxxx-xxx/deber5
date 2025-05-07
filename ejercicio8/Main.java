package ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elija una opción (1 para depósito, 2 para retiro): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el monto: ");
        float monto = sc.nextFloat();

        // Crear el objeto Banco con el monto ingresado
        Bancos operacion = new Bancos(monto);

        if (opcion == 1) {
            operacion.validarDeposito();
        } else if (opcion == 2) {
            operacion.validarRetiro();
        } else {
            System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
