import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        // Realizar las operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;
        
        // Mostrar los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El resto de la división es: " + resto);
        
        scanner.close();
    }
}
