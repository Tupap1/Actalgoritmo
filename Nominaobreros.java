/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nominaobreros;
import java.util.Scanner;

/**
 *
 * @author XTREME
 */
public class Nominaobreros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        final int valorHora = 1000; // Valor de la hora fijo
        int totalPagado = 0;

        Scanner scanner = new Scanner(System.in);

        for (int obrero = 1; obrero <= 5; obrero++) {
            System.out.print("Ingrese las horas " + obrero + ": ");
            int numeroHoras = scanner.nextInt();

            int valorPagar = valorHora * numeroHoras;
            totalPagado += valorPagar;

            System.out.println("El valor a pagar al obrero " + obrero + " es: " + valorPagar);
        }

        scanner.close();

        System.out.println("El valor total pagado a todos los obreros es: " + totalPagado);
    }
}

    