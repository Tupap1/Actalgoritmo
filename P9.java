import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio de la tarifa: ");
        double precioTarifa = scanner.nextDouble();
        
        System.out.print("Ingrese el precio pagado: ");
        double precioPagado = scanner.nextDouble();
        
        double descuento = precioTarifa - precioPagado;
        double porcentajeDescuento = (descuento / precioTarifa) * 100;
        
        System.out.println("El porcentaje de descuento es: " + porcentajeDescuento + "%");
        
        scanner.close();
    }
}
