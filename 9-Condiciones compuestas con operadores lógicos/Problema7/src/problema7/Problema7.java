
package problema7;

import java.util.Scanner;


public class Problema7 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int x,y;
        
        System.out.println("Ingresa la coordenada x , recuerda no debe ser cero :");
        
        x=teclado.nextInt();
        
        System.out.println("Ingresa la coordenada y , recuerda no debe ser cero :");
        
        y=teclado.nextInt();
        
        
        if( x > 0 && y > 0 ){
        
            System.out.println("Se ubica en el primer cuadrante");
                    
        }else if( x < 0 && y < 0){
        
            System.out.println("Se ubica en el segundo cuadrante");
        
        }
        
        
    }
    
}
