package javacourse;

import java.util.Scanner;
import java.io.IOException; 
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
import java.util.logging.Handler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;

class EdurekaLogger { 
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   
    public void sampleLog() 
    { 
        LOGGER.log(Level.WARNING, "warning"); 
    } 
}   
public class calculator { 
    public static void main(String[] args) 
    { 
        EdurekaLogger obj = new EdurekaLogger(); 
        obj.sampleLog(); 
        LogManager slg = LogManager.getLogManager();        
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);   
        log.log(Level.WARNING, "warning"); 
        
        try {
			Handler fileHandler = new FileHandler();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
		int choice;
		String continu;
		double num1, num2;
		Scanner inp = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("\nSelect operation\n1. add\n2. subtract\n3. multiply\n4. divide");
			System.out.println("Enter choice (1, 2, 3, 4): ");
			choice = inp.nextInt();
			
			System.out.println("Enter first number");
			num1 = inp.nextDouble();
			System.out.println("Enter second number");
			num2 = inp.nextDouble();
			
			if (choice == 1)
				System.out.println (num1+" + "+num2+ " = "+ add(num1, num2));
			else if (choice == 2)
				System.out.println (num1+" - "+num2+ " = "+ subtract(num1, num2));
			else if (choice == 3)
				System.out.println (num1+" * "+num2+ " = "+ multiply(num1, num2));
			else if (choice == 4)
				System.out.println (num1+" / "+num2+ " = "+ divide(num1, num2));
			else 
				System.out.println ("invalid operation!");
			
			System.out.println("\nContinue? y/n ");
			continu = inp.next();
			if (continu.equals("n"))
					break;
		}
	}
      public static double add (double n1, double n2) {
    	  return n1 + n2;
      }
      public static double subtract (double n1, double n2) {
    	  return n1 - n2;
      }
      public static double multiply (double n1, double n2) {
    	  return n1 * n2;
      }
      public static double divide (double n1, double n2) {
    	  if (n2 == 0) return 0;
    	  else return n1 / n2;
      }
      
}
