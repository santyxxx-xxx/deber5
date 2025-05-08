package ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elija una opción (1 para verificar velocidad de aceleracion, 2 para verificar velocidad de frenado): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese la velocidad inicial del automóvil: ");
        float velocidadInicial = sc.nextFloat();
        Automoviles auto = new Automoviles(velocidadInicial);

        System.out.println("Velocidad inicial: " + auto.getVelocidad() + " km/");
        // Aceleración
        System.out.print("Ingrese la cantidad de km/h para acelerar: ");
        float acelerar = sc.nextFloat();
        auto.acelerar(acelerar);

        // Validación de velocidad después de acelerar con el metodo
        auto.validarAceleracion();

        // Frenado
        System.out.print("Ingrese la cantidad de km/h para frenar: ");
        float frenar = sc.nextFloat();
        auto.frenar(frenar);

        // Validación de velocidad después de frenar con el metoso
        auto.validarFrenado();

        System.out.println("Velocidad final: " + auto.getVelocidad() + " km/h");
        sc.close();
    }
}

