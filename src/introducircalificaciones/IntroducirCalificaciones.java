
package introducircalificaciones;

import java.awt.BorderLayout;
import java.util.Scanner;


public class IntroducirCalificaciones {

    
    public static void main(String[] args) {
        
      
                
        
        
        System.out.println("Introduce el primer numero");
        Scanner one = new Scanner(System.in);
        double uno = one.nextDouble();
        
        System.out.println("Introduce el segundo numero");
        Scanner two = new Scanner(System.in);
        double dos = two.nextDouble();
        
        System.out.println("Introduce el tercer numero");
        Scanner three = new Scanner(System.in);
        double tres = three.nextDouble();
        
        double suma = uno+dos+tres;
        
        System.out.println("\nla suma de las calificaciones es " + suma);
        
        ///// otra forma
         
        double nota1, nota2, nota3, sumas;
        System.out.println("INTRODUCIR NOTAS");        
        Scanner notas = new Scanner(System.in);
        
        nota1= notas.nextDouble();
        nota2= notas.nextDouble();
        nota3= notas.nextDouble();
        
        sumas = nota1+nota2+nota3;
        
        System.out.println("\nLas calificaciones son " +suma);
        
       
                
                
        
        
        
        
       
        
        
        
        
       
     
       
        
        
        
        
        
        
        
        
    }
    
}
