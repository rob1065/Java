
package javaapplication31;
import java.util.Scanner;

public class Fruit {
    Scanner scannerin = new Scanner(System.in);
    public void shape(){
       
        System.out.println("What is the shape of the fruit");
        String shape = scannerin.nextLine();
        System.out.println("The shape of the fruit is " + shape);
    }
    
    public void color(){
       System.out.println("What is the color of the fruit"); 
       String color = scannerin.nextLine();
       System.out.println("The color of the fruit is " + color);
    }
    
    public void size(){
        System.out.println("What is the size of the fruit");
        String size = scannerin.nextLine();
        System.out.println("The size of the fruit is " + size);
    }
}

