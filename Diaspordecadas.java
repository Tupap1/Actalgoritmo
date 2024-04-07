/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diaspordecadas;
 import java.util.Scanner;
/**
 *
 * @author XTREME
 */
public class Diaspordecadas {

    public static void main(String[] args) {
  
        final int DIAS_POR_DECADA = 3650; // 10 años * 365 días por año
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de décadas: ");
        int decadas = scanner.nextInt();

        int dias = decadas * DIAS_POR_DECADA;

        System.out.println("El número de días equivalente a " + decadas + " décadas es: " + dias);

        scanner.close();
    }
}
    
    
