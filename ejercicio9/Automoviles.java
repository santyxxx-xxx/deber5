package ejercicio9;

public class Automoviles {
    private float velocidad;

    public Automoviles(float velocidad) {
        this.velocidad = velocidad;
    }

    public void validarAceleracion() {
        if (velocidad > 200) {
            System.out.println("Velocidad alta \nMULTA.");
        } else {
            System.out.print("Velocidad normal "+velocidad+" km/h");
        }
    }

    public void validarFrenado() {
        if (velocidad <= 0) {
            System.out.println("Velocidad invalida.");
        } else {
            System.out.println("Velocidad valida "+velocidad+" km/h");
        }
    }
    // Métodos acelerar y frenar

    public void acelerar(float incrementa) {
        if (velocidad + incrementa > 200) {
            System.out.println("No se puede acelerar más allá de 200 km/h.");
        } else {
            velocidad += incrementa;
            System.out.println("Velocidad actual: " + velocidad + " km/h");
        }
    }
    public void frenar(float disminuye) {
        if (velocidad - disminuye < 0) {
            System.out.println("No se puede frenar más allá de 0 km/h.");
        } else {
            velocidad -= disminuye;
            System.out.println("Velocidad actual: " + velocidad + " km/h");
        }
    }
    public float getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
}
