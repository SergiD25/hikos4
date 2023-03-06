
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class hilosprueba1 extends Thread
{
    public void run()
    {
        int dato;
        float resultado=0;
        
        Scanner entrada = new Scanner(System.in);
        int digito,digito1;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion a realizar: 1 para sumar 2 para restar y 3 para multiplcar y 4 para dividir"));
        
        switch(dato)
        {
            case 1 : System.out.println("Digite dos numeros: ");
                     System.out.println(" "); 
                     digito = entrada.nextInt();
                     digito1 = entrada.nextInt();
                     
                     resultado = digito + digito1;
                     System.out.println("El resultado de la operacion es: " + resultado);
                     break;
            
            case 2: System.out.println("Digite dos numeros: ");
                     digito = entrada.nextInt();
                     System.out.println(" "); 
                     
                     digito1 = entrada.nextInt();
                     
                     resultado = digito - digito1;
                     System.out.println("El resultado de la operacion es: " + resultado);
                     break;
                     
            case 3: System.out.println("Digite dos numeros: ");
            
                    digito = entrada.nextInt();
                     System.out.println(" "); 
                     
                     digito1 = entrada.nextInt();
                     
                     resultado = digito * digito1;
                     System.out.println("El resultado de la operacion es: " + resultado);
                     break; 
                     
            case 4: System.out.println("Digite dos numeros: ");
                    digito = entrada.nextInt();
                     System.out.println(" "); 
                     
                     digito1 = entrada.nextInt();
                     
                     resultado = digito / digito1;
                     System.out.println("El resultado de la operacion es: " + resultado);
                     break;         
            
            default: JOptionPane.showMessageDialog(null,"Operacion no se encuentra en el rango");
        }
                
    }
}