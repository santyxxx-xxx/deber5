package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juegos juego = new Juegos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nPuntuación actual: " + juego.Puntuacion());
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad de puntos a sumar: ");
                    int puntosSumar = sc.nextInt();
                    juego.sumarPuntos(puntosSumar);
                    break;
                case 2:
                    System.out.print("Cantidad de puntos a restar: ");
                    int puntosRestar = sc.nextInt();
                    juego.restarPuntos(puntosRestar);
                    break;
                case 3:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
