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
public class E10 {
    // Método Lanzador 
    public static void main(String args[]){
        //declaracion de la variable numDivisores
        String numDivisores ="(";
        //entrada por teclado del numero a evaluar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero :");
        int numero = teclado.nextInt();
        //bucle que obtiene los divisores y los concatena a numDivisores
        for (int i=1;i< numero;i++){ // (numero + 1)o <= numero???
            if (numero % i == 0){
                numDivisores += i;
                if (i < numero){
                    numDivisores += ", ";
                }
            }
    }
        numDivisores +=")";
        //salida de la variable
        System.out.println(numDivisores);
    }
}

//int p,x;
      //  try {
         //   x=Integer.parseInt(JOptionPane.showInputDialog("Intoduce un nro :"));
          //  p=x;
          //  while (p>0){
          //      if (x%p==0){
           //         System.out.print(p+",");
           //     }
           //     p=p-1;
           // }
      //  }catch (Exception e){
      //      JOption.showMessageDialog(null, "Error de formato");
     //   }
 //   }

  //  private static class JOption {

   //     public JOption() {
   //     }