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
public class E4 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int nro1, nro2;
        System.out.println("Introduce un numero 1:");
        nro1=a.nextInt();
         System.out.println("Introduce un numero 2:");
        nro2=a.nextInt();
        
        
        if (nro1>nro2)
            System.out.println("El resultado es :"+(nro1-nro2));
        if (nro1<nro2)
            System.out.println("El resultado es :"+(nro1+nro2));
        if (nro1==nro2)
            System.out.println("El resultado es :"+(nro1*nro2));
        
    }
}
