import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos por teclado
        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Cálculo del salario total
        double salarioTotal = valorHora * horasTrabajadas;

        // Cálculo de la retención en la fuente (5%)
        double retencionFuente = salarioTotal * 0.05;

        // Cálculo del salario neto
        double salarioNeto = salarioTotal - retencionFuente;

        // Impresión de resultados
        System.out.println("Salario total: $" + salarioTotal);
        System.out.println("Retención en la fuente: $" + retencionFuente);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
