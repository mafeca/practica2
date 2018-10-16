/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.util.Scanner;

/**
 *
 * @author mfc
 */
public class E3 {
    public static void main (String args []){
        
        Scanner sa=new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Introduce un numero 1:");
        numero1=sa.nextInt();
         System.out.println("Introduce un numero 2:");
        numero2=sa.nextInt();
        
        if (numero1==numero2)
            System.out.println(numero1 + " es igual que " + numero2);
        
        if (numero1>numero2)
            System.out.println(numero1 + " es mayor que " + numero2);
        
        if (numero1<numero2)
             System.out.println(numero1 + " es menor que " + numero2);
    }
}
