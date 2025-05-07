package ejercicio10;

public class Juegos {
    public int puntuacion;

    public Juegos() {
        this.puntuacion = 0; // Puntuación inicial
    }

    public int Puntuacion() {
        return puntuacion;
    }

    public void sumarPuntos(int puntos) {
        if (puntos <= 0) {
            System.out.println("Error: No se pueden sumar puntos negativos o cero.");
        } else {
            puntuacion += puntos;
            System.out.println("Se sumaron " + puntos + " puntos. Puntuación actual: " + puntuacion);
        }
    }

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

