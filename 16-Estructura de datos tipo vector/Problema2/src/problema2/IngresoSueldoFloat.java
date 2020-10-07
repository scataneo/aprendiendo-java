
package problema2;

import java.util.Scanner;


public class IngresoSueldoFloat {
    private Scanner teclado=new Scanner(System.in);
    private float [] altura=new float[5];
    private float promedio=0;
    
    
    
    public void obtenerAltura(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la altura");
            altura[i]=teclado.nextInt();
            System.out.println("Las alturas son  " + altura[i]);
        }
        
    }
    
    public void obtenerPromedio(){
        for (int i = 0; i < 5; i++) {
            promedio=altura[i]/5;
        }
        System.out.println("Su promedio es  " + promedio);
    }
    
    public void contarPersonasAltas(){
        for (int i = 0; i < altura.length; i++) {
            if(altura[i]>promedio){
                System.out.println("Hay  " + altura[i] + " Personas altas");
            }
        }
    
    }
    
    public void contarPersonasBajas(){
        for (int i = 0; i < altura.length; i++) {
            if(altura[i]<promedio){
                System.out.println("Hay  " + altura[i] + " Personas bajas");
            }
        }
    
    }
    
    
    
}
