/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areadeunpentagono;
import java.util.Scanner;

/**
 *
 * @author XTREME
 */
public class Areadeunpentagono {

    public static void main(String[] args) {
       

/**
 *
 * @author XTREME
 */
{

    }
        //hallar el area de un pentagono 
        int lado = 6;
        int perimetro;
        int apotema = 4;
        int area;
        System.out.println("Calcular el area y perimetro de un pentagono");
        System.out.println("Datos ladoes: "+lado+" apotema es "+apotema);
        System.out.println("------------------------------");
        
        perimetro = lado*6;
        area =(perimetro*apotema)/2;
        
        System.out.println("el area del pentagono es: "+ area);

    }
}
