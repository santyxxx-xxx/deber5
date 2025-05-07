package ejercicio9;

public class Automoviles {
    public float velocidad;

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
}
