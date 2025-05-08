package ejercicio11;

public class Configuracion_App {
    // Atributos de la clase en privado
    private String idioma;
    private boolean notificaciones;

    // Constructor
    public Configuracion_App(String idioma, boolean notificaciones) {
        this.idioma = idioma;
        this.notificaciones = notificaciones;
    }

    // Metodo para validar el idioma
    public boolean validarIdioma() {
        if (idioma.equals("Español") || idioma.equals("Inglés") || idioma.equals("Francés")) {
            return true;
        }
        return false;
    }
    // Metodo para validar notificaciones
    public boolean validarNotificaciones() {
        return notificaciones;
    }

    // Metodo para mostrar configuración
    public void mostrarConfiguracion() {
        System.out.println("\nConfiguración actual:");
        System.out.println("Idioma seleccionado: " + idioma);
        System.out.println("Estado de notificaciones: " + (notificaciones ? "Activadas" : "Desactivadas"));
    }
}



