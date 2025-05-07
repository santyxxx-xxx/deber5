package ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la calificación (1-10): ");
        int nota = sc.nextInt();


        if (nota < 1 || nota > 10) {
            System.out.println("La calificación debe estar entre 1 y 10.");
        } else {
            categoriaDeCalificacion categoria = new categoriaDeCalificacion(nota);

            char resultado = categoria.calcularCategoria();

            System.out.println("La categoría de la calificación es: " + resultado);
        }

        sc.close();
    }
}

