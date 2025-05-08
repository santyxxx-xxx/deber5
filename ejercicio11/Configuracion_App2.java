package ejercicio11;

public class Configuracion_App2 {

        // Encapsulación: atributos privados
        private String idioma;
        private boolean notificaciones;

        // Constructor
        public  Configuracion_App2(String idioma, boolean notificaciones) {
            this.idioma = idioma;
            this.notificaciones = notificaciones;
        }

        public String getIdioma() {
            return idioma;
        }

        // Metodo para obtener el estado de las notificaciones
        public boolean isNotificaciones() {
            return notificaciones;
        }

        // Metodo para cambiar el idioma con validación usando equals
        public void cambiarIdioma(String nuevoIdioma) {
            if (nuevoIdioma.equals("Español") || nuevoIdioma.equals("Inglés") || nuevoIdioma.equals("Francés")) {
                this.idioma = nuevoIdioma;
                System.out.println("Idioma cambiado a: " + nuevoIdioma);
            } else {
                System.out.println("Error: Idioma no válido.");
            }
        }

        public void activarNotificaciones(boolean estado) {
            this.notificaciones = estado;
            System.out.println("Notificaciones " + (estado ? "activadas" : "desactivadas"));
        }

        public void mostrarConfiguracion() {
            System.out.println("\nConfiguración actual:");
            System.out.println("Idioma seleccionado: " + idioma);
            System.out.println("Estado de notificaciones: " + (notificaciones ? "Activadas" : "Desactivadas"));
        }
    }

