/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.masayaire;
import java.util.Scanner;
/**
 *
 * @author XTREME
 */
public class Masayaire {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la presión del aire en mmHg: ");
        double presion = scanner.nextDouble();

        System.out.print("Ingrese el volumen del aire en litros: ");
        double volumen = scanner.nextDouble();

        System.out.print("Ingrese la temperatura del aire en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        double masa = (presion * volumen) / (0.37 * (temperatura + 460));

        System.out.println("La masa del aire es: " + masa + " gramos.");

        scanner.close();
    }
}
    

