package ejercicio10;

public class Juegos {
    // Atributo privado
    private int puntuacion;

    public Juegos() {
        this.puntuacion = 0;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    // Metodo para sumar puntos
    public void sumarPuntos(int puntos) {
        if (puntos > 0) {
            puntuacion += puntos;
            System.out.println("Se sumaron " + puntos + " puntos. Puntuación actual: " + puntuacion);
        } else {
            System.out.println("Error: No se pueden sumar puntos negativos o cero.");
        }
    }

    // Metodo para restar puntos
    public void restarPuntos(int puntos) {
        if (puntos <= 0) {
            System.out.println("Error: No se pueden restar puntos negativos o cero.");
        } else if (puntuacion - puntos < 0) {
            System.out.println("Error: No se puede reducir la puntuación por debajo de 0.");
        } else {
            puntuacion -= puntos;
            System.out.println("Se restaron " + puntos + " puntos. Puntuación actual: " + puntuacion);
        }
    }
}