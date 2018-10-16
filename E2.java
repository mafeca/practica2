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
public class E2 {
    public static void main(String args []){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un numero:0");
        int numero= scan.nextInt();
        if (numero==0){
            System.out.println("El numero "+numero+" es 0");
        }else{
            if(numero>0){
                System.out.println("El numero "+numero+" es positivo");
            }else{
                System.out.println("El numero "+numero+" es negativo");
            }
        }
    }
}
