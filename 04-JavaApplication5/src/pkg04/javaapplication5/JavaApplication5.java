/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int num,num2,num3;
        
        System.out.println("Ingrese un numero");
        
        num=teclado.nextInt();
        
        System.out.println("Ingrese un numero");
        
        num2=teclado.nextInt();
        
        System.out.println("Ingrese un numero");
        
        num3=teclado.nextInt();
        
        
        if(num>num2 && num>num3){
            
            System.out.println(num + "Es mayor");
            
        }else if(num2>num3){
            
             System.out.println(num2 + "Es mayor");
            
         }else{
             System.out.println(num3 + "Es mayor");
         }
            
           
           
           
        }
        
}
    
