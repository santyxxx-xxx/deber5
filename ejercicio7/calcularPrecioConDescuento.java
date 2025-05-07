package ejercicio7;

public class calcularPrecioConDescuento {

    public float precio;
    public float descuento;

    public calcularPrecioConDescuento(float precio, float descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    public float Descuento() {
        float descuentototal = precio * (descuento / 100);
        return precio - descuento;
    }


}


