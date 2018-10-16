/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author mfc
 */
public class E9 {
    public static void main(String args[]) throws IOException{
        InputStreamReader flujoEntrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujoEntrada);
        int n;
        String continuar = "Si";
        //Scanner entrada = new Scanner(System.in);
        while (continuar.equals("Si")){
                       
                 System.out.println("Introduce un numero :");
                   n = Integer.parseInt(teclado.readLine());
                   System.out.println("La tabla de multiplicar del numero :"+n);
                    for(int i=1;i<=10;i++){
            
                    System.out.println(n + " * " + i + " = " + n*i);
        }
       System.out.println("Desea continuar Si/No");
        continuar = teclado.readLine();    
            
        }
    }
}
