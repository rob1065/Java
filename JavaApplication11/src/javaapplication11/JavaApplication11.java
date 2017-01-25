
package javaapplication11;

import java.util.Scanner;
public class JavaApplication11 {

    
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.println("what is your name ");
     String name = scanner.nextLine();
     System.out.println("Your name is " + name);
     System.out.println("enter three numbers ");
             int one = scanner.nextInt();
             int two = scanner.nextInt();
             int three = scanner.nextInt();
     System.out.println("Your three numbers are " + one +" " + two + " " +three);
     int total = (one + two + three);
     System.out.println("your total of the three numbers is " + total);
     int average = (total / 3);
     System.out.println("Your average of the three numbers is " + average);
     System.out.println(" ");
     
     for(int i = 20; i < 2; i--){
         System.out.println(i);
     }
     
    }
    
}
