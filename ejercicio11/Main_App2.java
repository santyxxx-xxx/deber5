package ejercicio11;
import java.util.Scanner;
public class Main_App2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el idioma deseado (Español, Inglés, Francés): ");
            String idiomaIngresado = sc.nextLine();

            System.out.print("¿Desea activar las notificaciones? (true/false): ");
            boolean notificacionesIngresadas = sc.nextBoolean();
            sc.nextLine();  // Limpiar buffer

            // Crear objeto (configuración)
            Configuracion_App2 config = new Configuracion_App2(idiomaIngresado, notificacionesIngresadas);
            config.mostrarConfiguracion();

            // Permitir cambios en la configuración
            System.out.print("\nIngrese un nuevo idioma (Español, Inglés, Francés): ");
            String nuevoIdioma = sc.nextLine();
            config.cambiarIdioma(nuevoIdioma);

            System.out.print("¿Desea modificar las notificaciones? (true/false): ");
            boolean nuevoEstadoNotificaciones = sc.nextBoolean();
            config.activarNotificaciones(nuevoEstadoNotificaciones);

            config.mostrarConfiguracion();

            sc.close();
        }
    }

