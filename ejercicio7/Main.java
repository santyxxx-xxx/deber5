package ejercicio7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio original: ");
        float precio = sc.nextFloat();
        System.out.print("Ingrese el porcentaje de descuento: ");
        float descuento = sc.nextFloat();
        calcularPrecioConDescuento producto = new calcularPrecioConDescuento(precio,descuento);
        float descuentototal = producto.Descuento();
        System.out.println("El total es: $"+descuentototal);
    }
}
