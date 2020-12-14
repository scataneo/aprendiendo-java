/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private Scanner teclado=new Scanner(System.in);
    private String nombre;
    private int edad;

    public Alumno() {
        System.out.println("Ingresa tu nombre :");
        nombre=teclado.next();
        System.out.println("Ingresa tu edad :");
        edad=teclado.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Tu nombre es  " + nombre);
        System.out.println("Tu edad es  " + edad);
    }
    
    public void siEsMayorOMenor(){
        if(edad>=18){
            System.out.println("Eres mayor puedes pasar");
        }else{
            System.out.println("Eres menor no puedes ingresar");
        }
    }
}
