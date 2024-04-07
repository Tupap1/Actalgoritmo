import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        // Obtener la última cifra del número
        int ultimaCifra = numero % 10;
        
        // Mostrar la última cifra
        System.out.println("La última cifra del número es: " + ultimaCifra);
        
        scanner.close();
    }
}
