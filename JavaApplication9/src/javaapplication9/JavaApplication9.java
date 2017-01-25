

package javaapplication9;

import java.util.Scanner;
import java.util.Random;


public class JavaApplication9 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("what is your name ");
       String name = scanner.nextLine();
       System.out.println("your name is " + name);
       System.out.println("");
       System.out.println("how old are you " +name);
       int age = scanner.nextInt();
       System.out.println(name + " , you are " + age + " years old");
      
       for(int i = 0; i <= 100; i+=5)
           System.out.println(i);
       
       int car = 5;
       
       if (car == 2){
           System.out.println("this is 5");
       }  else {
           System.out.println("this is not 5");
       } 
       int finger = 4;
       switch (finger){
           case 1:
               System.out.println("red");
               break;
           case 2:
               System.out.println("blue");
               break;
           case 3:
               System.out.println("green");
               break;
           default:
               System.out.println("no color");
       }
       Scanner scannerSmall = new Scanner (System.in);
       
       Double one;
       Double two;
       Double three;
       Double average;
       
       System.out.println("please enter three numbers");
       one = scannerSmall.nextDouble();
       two = scannerSmall.nextDouble();
       three = scannerSmall.nextDouble();
       
       average = (one + two + three)/ 3;
       System.out.println("your average is " + average);
       
       Random random = new Random();
       
       int diceOne;
       int diceTwo;
       
       for(int i = 0; i < 20; i++){
           diceOne = random.nextInt(6) +1;
           diceTwo = random.nextInt(6) +1;
           System.out.println("dice one is " + diceOne + " and dice two is " + diceTwo);
       }
       
           
    }
}
    

