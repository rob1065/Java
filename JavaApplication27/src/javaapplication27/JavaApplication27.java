
package javaapplication27;
import java.util.Scanner;


public class JavaApplication27 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for loop count 0 to 100
        for(int i = 0; i <= 100; i+=5){
            System.out.println(i);
        }
        System.out.println("next for loop");
        //for loop count 100 to 0
        for(int a =100; a >= 0; a-=5){
            System.out.println(a);
        }
        //switch statement
        System.out.println("pick a number between 0 and 5");
        int guessNumber = scanner.nextInt();
        switch(guessNumber){
            case 0:
                System.out.println("this is the number 0");
                break;
            case 1:
                System.out.println("this is the number 1");
                break;
            case 3:
                System.out.println("this is the number 3");
                break;
            case 4:
                System.out.println("this is the number 4");
                break;
            case 5:
                System.out.println("this is the number 5");
                break;
            default:
                System.out.println("you did not enter a number between 0 and 5");
                break;
        }
        
        
        //if statement
        int big = 4;
        int small = 2;
        
        if(big < small){
            System.out.println("small is bigger than big");   
        }else if(big > small){
            System.out.println("big is bigger then small");
        }
        //do while statement
        int boy = 7;
        while (boy <=20){
            System.out.println(boy);
            boy++;
        }
        //array
        String [] countdown ={"five", "four", "three", "two", "one"
    };
        for(int i = 0; i <countdown.length; i++){
            System.out.println("the countdown is " + countdown[i]);
        }
        System.out.println("Blast off");
        
        //Calling a new class
       Animal animal = new Animal();
       animal.dog("pig");
       animal.size('L');
       
       //calling a method
       punch(6);
    }
    public static int punch(int count){
        int number = count;
        System.out.println("you knocked out that person in " + number + " hits");
        return number;
    }
}
//a new class
class Animal{
    //a method in a class
    public String dog(String type){
        String one = type;
        System.out.println("you have a " + one);
        return one;
    }
    //a method in a class
    public char size(char a){
        char build = a;
        System.out.println("the size of the animal is " +build);
        return build;
    }   
    
}

