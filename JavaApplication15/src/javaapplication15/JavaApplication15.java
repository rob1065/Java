
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("what is the color of the sky?");
       String color = scanner.nextLine();
       System.out.println("you picked the color " + color);
       
       for(int i = 50; i > 0; i-=2){
           System.out.println(i);
       }
       System.out.println("this is another class of 5 pluse 8");
       Open open = new Open();
       open.add(5, 8);
       
       System.out.println("this is another class of 10 pluse 20");
       Open open2 = new Open();
       open2.add(10, 20);
       
       System.out.println("This is a new class for the flag");
       Closed closed = new Closed();
       closed.flag();
       
       System.out.println("this is another class using same name");
       Both both = new Both();
       both.brown(5,7);
       both.brown(2.5, 2.9);
       
       
    }
    
}
class Open{
    int one;
    int two;
    public void add(int first, int second){
        int one = first;
        int two = second;
        int sum = first + second;
        System.out.println(sum);
    }
}
class Closed{
    
    public void flag(){
        System.out.println("The colors of the flag are red, white and blue");
    }
           
}

class Both{
    int green;
    int black;
    int total = green + black;
    public void brown(int g, int b){
        this.green = g;
        this.black = b;
        this.total = green + black;
      System.out.println(total + " intiger");
    }
    public void brown(double g, double b){
        double green = g;
        double black = b;
        double total = green + black;
        System.out.println(total + " double");
        
    }
}