package ejercicio11;
import java.util.Scanner;

public class Main_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar idioma al usuario
        System.out.print("Ingrese el idioma deseado (Español, Inglés, Francés): ");
        String idiomaIngresado = sc.nextLine();

        // Solicitar configuración de notificaciones
        System.out.print("¿Desea activar las notificaciones? (true/false): ");
        boolean notificacionesIngresadas = sc.nextBoolean();

        // Crear configuración
        Configuracion_App config = new Configuracion_App(idiomaIngresado, notificacionesIngresadas);

        // Validar idioma antes de mostrar configuración
        if (!config.validarIdioma()) {
            System.out.println("Error: Idioma no válido.");
        } else {
            config.mostrarConfiguracion();
        }

        sc.close();
    }
}
