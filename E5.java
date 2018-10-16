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
public class E5 {
       
	public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            int opcion, num1,num2;
            //System.out.println("Introduce un numero 1:");
            //num1=entrada.nextInt();
            //System.out.println("Introduce un numero 2:");
            //num2=entrada.nextInt();
	    System.out.println("Menus de opciones");
            System.out.println("------------------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Elige opción: ");
            opcion=entrada.nextInt();
            System.out.println("\n");
            
            System.out.println("Introduce un numero 1:");
            num1=entrada.nextInt();
            System.out.println("Introduce un numero 2:");
            num2=entrada.nextInt();
            
            //System.out.println("Elige opción: ");         
            switch(opcion){
		case 1: 
                    	System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case 2: 
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case 3: 
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case 4: 
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		case 5: 
			System.out.println("Adios!");
			break;
		default:
			System.out.println("Número no reconocido");break;
			}
				
		//System.out.println("\n"); //Mostrar un salto de línea en Java
				
			//}catch(Exception e){
		//System.out.println("Uoop! Error!");
			}
}

	
	//Método para recoger variables por consola
	
        
        
    

