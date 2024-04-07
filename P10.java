import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del artículo: ");
        double precioArticulo = scanner.nextDouble();
        
        // Definimos el porcentaje de IVA
        double porcentajeIVA = 0.16; // Suponiendo un IVA del 16%
        
        // Calculamos el valor del IVA
        double valorIVA = precioArticulo * porcentajeIVA;
        
        System.out.println("El valor pagado por el IVA es: " + valorIVA);
        
        scanner.close();
    }
}
