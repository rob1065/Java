
package javaapplication30;
import java.util.Scanner;

public class JavaApplication30 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       Animals animalsOne = new Animals();
           
       System.out.println("what is the name of your animal? ");
       String name = scanner.nextLine();
       
       System.out.println("What is the color of your animal?");
       String color = scanner.nextLine();
       
       System.out.println("What is the referance number for your animal");
       int number = scanner.nextInt();
       
       animalsOne.setName(name);
       animalsOne.setColor (color);
       animalsOne.setRefNumber(number);
       animalsOne.printA();
      
       
       
    }
    
}
