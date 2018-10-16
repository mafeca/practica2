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
public class E8 {
    
    public static void main(String args[]){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero :");
            n = entrada.nextInt();
        System.out.println("La tabla de multiplicar del numero :"+n);
        for(int i=1;i<=10;i++){
            
            System.out.println(n + " * " + i + " = " + n*i);
        }
            System.out.println("¿Quieres volver a empezar S/N?");
            
    }
    
    
}
