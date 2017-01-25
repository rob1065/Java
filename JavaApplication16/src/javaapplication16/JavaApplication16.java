
package javaapplication16;
import java.util.Scanner;
import java.util.Random;

public class JavaApplication16 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       System.out.println("What is the name of your favorite dog");
       String dogName = scanner.nextLine();
       System.out.println("The name of your favorite dog is " + dogName + "\n");
       System.out.println("this is a for loop\n");
       System.out.println("count from 0 up by 5's");
       for(int i = 0; i < 50; i+=5){
           System.out.println(i);
       }
       System.out.println("count from 50 down by 5's");
       for(int j = 50; j > 0; j-= 5){
           System.out.println(j);
       }
       System.out.println("this is a if statement\n");
       int cat = 5;
       if (cat == 3){
           System.out.println("the number is 3");
       }else {
           System.out.println("the number must be 5");
       }
       System.out.println("this is a while statement\n");
       int mouse = 0;
       while (mouse < 6){
        System.out.println("the number is " + mouse);
        mouse++;
    }
       System.out.println("this is a switch statement\n");
       System.out.println("a number between 1 and 5");
       int number = scanner.nextInt();
       switch(number){
           case 1:
               System.out.println("the number is 1");
               break;
           case 2:
               System.out.println("the number is 2");
               break;
            case 3:
               System.out.println("the number is 3");
               break;
           case 4:
               System.out.println("the number is 4");
               break;  
           case 5:
               System.out.println("the number is 5");
               break;
           default:
               System.out.println("you did not pick a number between 1 and 5");
               break;
       }
       Random random = new Random();
       int dieOne;
       int dieTwo;
       int count = 0;
       
       for(int i = 0; i < 50; i++){
           dieOne = random.nextInt(20) +1;
           dieTwo = random.nextInt(20) +1;
           System.out.println(dieOne + " " + dieTwo);
           
           if(dieOne == dieTwo){
               count++;
           }
       }
       System.out.println("I had this many double rolls " + count);
    }
    
}
