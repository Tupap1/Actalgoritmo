/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularpulsaciones;
import java.util.Scanner;
/**
 *
 * @author XTREME
 */
public class Calcularpulsaciones {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        double pulsaciones = (220 - edad) / 10.0; // Convertir el resultado a double para obtener decimales

        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + pulsaciones);

        scanner.close();
    }
}
    
