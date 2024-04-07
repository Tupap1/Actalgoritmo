import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la medida en centímetros
        System.out.print("Ingrese la medida en centímetros: ");
        double centimetros = scanner.nextDouble();
        
        // Convertir centímetros a pulgadas (1 pulgada = 2.54 centímetros)
        double pulgadas = centimetros / 2.54;
        
        // Mostrar el resultado
        System.out.println(centimetros + " centímetros equivalen a " + pulgadas + " pulgadas.");
        
        scanner.close();
    }
}