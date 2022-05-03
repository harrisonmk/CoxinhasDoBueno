
package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
      DecimalFormat deci = new DecimalFormat("0.00");
      Scanner scan = new Scanner(System.in);
      
      double valor1;
      double valor2;
      
      valor1 = scan.nextDouble();
      valor2 = scan.nextDouble();
        
      
     double resultado = valor1 / valor2;
        
     System.out.println(deci.format(resultado));
        
    }
    
}
