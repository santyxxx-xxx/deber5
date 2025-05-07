package ejercicio6;

public class categoriaDeCalificacion {

    public int calificacion;

    public categoriaDeCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


    public char calcularCategoria() {
        if (calificacion >= 9) {
            return 'A';
        } else if (calificacion >= 8) {
            return 'B';
        } else if (calificacion >= 7) {
            return 'C';
        } else if (calificacion >= 6) {
            return 'D';
        } else {
            return 'F';
        }
    }
}