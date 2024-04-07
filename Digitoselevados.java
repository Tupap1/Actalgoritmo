/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitoselevados;
import java.util.Scanner;
/**
 *
 * @author XTREME
 */
public class Digitoselevados {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // ingrese un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar que el número ingresado sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            return;
        }

        // Convertir el número en un arreglo de dígitos
        int[] digitos = new int[5];
        for (int i = 0; i < 5; i++) {
            digitos[i] = numero % 10; // Obtener el último dígito del número
            numero /= 10; // Eliminar el último dígito del número
        }

        // Elevar al cuadrado el primer y último dígito
        int primerDigitoElevado = digitos[4] * digitos[4];
        int ultimoDigitoElevado = digitos[0] * digitos[0];

        // Imprimir los resultados
        System.out.println("El primer dígito elevado al cuadrado es: " + primerDigitoElevado);
        System.out.println("El último dígito elevado al cuadrado es: " + ultimoDigitoElevado);

        
    }
}
    

