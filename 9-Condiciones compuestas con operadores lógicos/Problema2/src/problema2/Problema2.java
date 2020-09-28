
package problema2;

import java.util.Scanner;


public class Problema2 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        int dia,mes,anio;
        
        System.out.println("Introduce un dia del mes :");
        
        dia=teclado.nextInt();
        
        System.out.println("Introduce un mes :");
        
        mes=teclado.nextInt();
        
        System.out.println("Introduce un anio :");
        
        anio=teclado.nextInt();
        
        if(mes==1 || mes==2 || mes==3){
        
            System.out.println("Corresponde al primer trimestre");
        
        }
        
            System.out.println("La fecha ingresada es  "  + dia + "/ "  + mes + " /" + anio + "");
    }
    
}
