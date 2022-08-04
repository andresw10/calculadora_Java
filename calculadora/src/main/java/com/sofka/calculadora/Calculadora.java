/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.calculadora;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Calculadora {


    public static void main(String[] args) {

        String r;
        double resultado,a,b;
      
        Scanner  input=new Scanner(System.in);
      
    
   
                  
        do {
            System.out.println( "---------Menu-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] Sumar");
		 System.out.println("-       [2] Restar" );
		 System.out.println("-       [3] Multiplicar");
                 System.out.println("-       [4] Dividir");
                 System.out.println("-       [5] Módulo");
                 System.out.println("-       [6] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1" -> {
                         System.out.println("SUMA");
                         System.out.println("--------------------------------------");
                         System.out.println("Teniendo en cuenta que la Suma es:  ");
                         System.out.println(" resultado=a+b  ");
                             
     
             System.out.println("digite valor de [a]");
                a=input.nextDouble();
                System.out.println("digite valor de [b]");
                b=input.nextDouble();  
               
                         resultado=a+b;
                         System.out.println(" El resultado es ="+resultado);
        }
					
                     case "2" -> {
                         System.out.println("RESTA");
                         System.out.println("--------------------------------------");
                         System.out.println("Teniendo en cuenta que la Resta  ");
                         System.out.println(" resultado=a-b  ");
                         System.out.println("digite valor de [a]");
                a=input.nextDouble();
                System.out.println("digite valor de [b]");
                b=input.nextDouble();  
               
                         resultado=a-b;
                         System.out.println("resultado es ="+resultado);
        }
                     			
                     case "3" -> {
                         System.out.println("MULTIPLICAR");
                         System.out.println("--------------------------------------");
                         System.out.println("Teniendo en cuenta que la producto  ");
                         System.out.println(" resultado=axb  ");
                         System.out.println("digite valor de [a]");
                a=input.nextDouble();
                System.out.println("digite valor de [b]");
                b=input.nextDouble();  
               
                         resultado=a*b;
                         System.out.println("resultado es ="+resultado);
        }
                         
                         			
                     case "4" -> {
                         System.out.println("DIVIDIR");
                         System.out.println("--------------------------------------");
                         System.out.println("Teniendo en cuenta que la Divicion es ");
                         System.out.println(" resultado=a/b  ");
                           do {
     
             System.out.println("digite valor de [a]");
                a=input.nextDouble();
                System.out.println("digite valor de [b]");
                b=input.nextDouble();  
                 if (b==0) {
                     System.out.println("el valor [b] no puede ser = 0 (cero)");
                 }else{
                  resultado=a/b;
                         System.out.println("resultado es ="+resultado);
                 }
            } while (b==0);
                        
        }
                         			
                     case "5" -> {
                         System.out.println("MODULAR");
                         System.out.println("--------------------------------------");
                         System.out.println("Teniendo en cuenta que el modulo es  ");
                         System.out.println(" resultado=a%b  ");
                           do {
     
             System.out.println("digite valor de [a]");
                a=input.nextDouble();
                System.out.println("digite valor de [b]");
                b=input.nextDouble();  
                 if (b==0) {
                     System.out.println("el valor [b] no puede ser = 0 (cero)");
                 }else{
                    resultado=a%b;
                         System.out.println("resultado es ="+resultado);
                 }
            } while (b==0);
                      
        }
                     case "6" -> System.out.print("Adios");
                     default -> {

                         System.out.println("Opcion incorrecta");

                    }
                 }
        } while (!"6".equals(r));
    }
}
