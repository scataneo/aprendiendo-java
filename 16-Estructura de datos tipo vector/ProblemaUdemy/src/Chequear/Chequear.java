/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chequear;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Chequear {
    
    private Scanner teclado=new Scanner(System.in);
    
    private String email;
    
    public void ingresaDatos(){
        System.out.println("Ingrese tu email");
        email=teclado.next();
        
    }
    
    public void imprimirDatos(){
        System.out.println("Tu email es :" + email);
    }
    
    public void chequearEmail(){
       if(email.length()<4 && email.length()==3){
           System.out.println("es valido");
       
       }
        
    }
    
}
