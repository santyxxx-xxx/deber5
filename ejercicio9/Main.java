package ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elija una opción (1 para verificar velocidad de aceleracion, 2 para verificar velocidad de frenado): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese la velocidad: ");
        float velocidad = sc.nextFloat();


        Automoviles validacion = new Automoviles(velocidad);

        if (opcion == 1) {
            validacion.validarAceleracion();
        } else if (opcion == 2) {
            validacion.validarFrenado();
        } else {
            System.out.println("Opción no válida.");
        }

        sc.close();
    }
}

