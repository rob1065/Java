
package javaapplication6;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication6 {

    
    public static void main(String[] args) {
        int numberOne = 0;
        
        while (numberOne < 10){
            System.out.println("this is number " + numberOne);
            numberOne++;
        }
       
       for (int i = 0; i < 10; i++){
           System.out.println("this is number " + i);
       }
    
       for (int i = 0; i < 10; i+=2){
           System.out.println("this is number " + i);
       }
    
    int numberTwo = 8;
    
    if (numberTwo < 5){
        System.out.println("this is smaller than 5");
    }else {
        System.out.println("this is larger than 5");
    }
       System.out.println("this is going to print, no matter what the number is");
  
  int number = 9;
  
  switch (number){
      case 8:
          System.out.println("this is number 8");
          break;
      case 7:
          System.out.println("this is number 7");
          break;
      case 9:
          System.out.println("this is number 9");
          break;
      default:
          System.out.println("this is not the number");
  }
 
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is your name ");
    String name = scanner.nextLine();
    System.out.println("your name is " + name);
   
    Scanner scannerOne = new Scanner (System.in);
    System.out.println("what is your favorite number ");
    int numberThree = scanner.nextInt();
    System.out.println("your number is " + numberThree);
    
    Scanner scannerTwo = new Scanner (System.in);
     double [] price = new double [5];
     
     System.out.println("enter 5 prices ");
     price [0] = scanner.nextDouble();
     price [1] = scanner.nextDouble();
     price [2] = scanner.nextDouble();   
     price [3] = scanner.nextDouble();
     price [4] = scanner.nextDouble();
     
     double total = price[0] + price[1] + price[2] + price[3] + price[4];
     System.out.printf("The price of the total bill is $%5.2f",total);
  
     Scanner scannerThree = new Scanner(System.in);
    
     double mpg;
     double miles;
     double priceOfFuelPerGallon;
     double totalCost;
     
     System.out.println("enter the  miles per gallon ");
     mpg = scanner.nextDouble();
     System.out.println("enter the miles driven");
     miles = scanner.nextDouble();
     System.out.println("enter the price of the fuel");
     priceOfFuelPerGallon = scanner.nextDouble();
     
     totalCost = (miles/mpg)* priceOfFuelPerGallon;
     
     System.out.printf("the total cost of the trip will be $%5.2f",totalCost);
     
  
     System.out.println("keep printing me out for this loop");
     
     int count = 0;
     
     do {
         System.out.println("print me again " + count);
         count++;
     } while (count < 10);
   
   
   int dieOne;
   int dieTwo;
   int countDoubles = 0;
   
   Random random = new Random ();
   
   for (int i = 0; i < 100; i++){
       dieOne = random.nextInt (6)+1;
       dieTwo = random.nextInt (6)+1;
       
       System.out.println(dieOne);
       System.out.println(dieTwo);
       
       if (dieOne == dieTwo){
           countDoubles++;
       }
   }
     System.out.println("I had " +countDoubles+ " doubles");
 
 
    
     double first;
     double second;
     double third;
     double average;
     
     Scanner scannerFour = new Scanner (System.in);
     System.out.println("enter three numbers");
     first = scannerFour.nextDouble();
     second = scannerFour.nextDouble();
     third = scannerFour.nextDouble();
     
     average = (first + second + third) / 3;
     System.out.println("the average is " + average);
     
    }
    
}
