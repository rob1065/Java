
package javaapplication13;

import java.util.Scanner;
public class JavaApplication13 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is you name? ");
       String name = scanner.nextLine();
       System.out.println("How old are you? ");
       int age = scanner.nextInt();
       System.out.println("Your name is " + name + " and you are " + age + " years old");
       
       int number = 5;
       
       while(number < 15){
           System.out.println("your number " + number +  " is less then 15.");
           number ++;
       } 
       for (int i = 0; i < 20; i++){
           System.out.println("your number is " +i);
       }
       
       int color = 6;
       if (color > 9){
           System.out.println("your number is greater then 9");
       }else if (color < 7){
           System.out.println("your number is less then 7");
       }
       
       System.out.println("Enter a number between 1 and 6");
       int guess = scanner.nextInt();
       switch(guess){
           case 1:
               System.out.println("this is one");
               break;
           case 2:
               System.out.println("this is two");
               break;
           case 3:
               System.out.println("this is three");
               break;
            case 4:
               System.out.println("this is four");
               break;
            case 5:
               System.out.println("this is five");
               break;
            case 6:
               System.out.println("this is six");
               break;
            default:
                System.out.println("you did not enter a number between one and six");
       }
       
      String [] words= { "one","two","three","four","five"
    };
      for(int i = 0; i < words.length; i++){
        System.out.println("The countdown is " + words[i]);   
      }
       walk();
       mine();
       
       int w = 7;
       int h = 9;
       int a = area(w, h);
       System.out.println("the total area is " + a);
    
    }
    public static void walk(){
        int green = 4;
        int blue = 99;
        int total = (green + blue);
        System.out.println("the total of green and blue are " + total);   
    }
    public static void mine(){
        System.out.println("this is how you call a method in Java");
        System.out.println("Yea, it worked");
    }
    public static int area (int width, int height){
        int area;
        area = width * height;
        return area;
    }
    
}
