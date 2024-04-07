import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia en millas marinas: ");
        double millasMarinas = scanner.nextDouble();
        
        double metros = millasMarinas * 1852;
        
        System.out.println("La distancia en metros es: " + metros);
        
        scanner.close();
    }
}

