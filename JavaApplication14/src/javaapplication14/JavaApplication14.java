
package javaapplication14;
import java.util.Scanner;

public class JavaApplication14 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Hello everybody, Im Rob, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " how old are you? ");
        int age = scanner.nextInt();
        System.out.println(name + " you are " + age + " years old");
        
        for(int i = 0; i < 50; i+=2){
            System.out.println("the number is " + i);
        }
        
        for(int j = 10; j > 0; j--){
            System.out.println("the number is " + j);
        }
        
        System.out.println("Enter a number between 1 and 8");
        int nothing = scanner.nextInt();
        
        switch( nothing){
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
            case 6:
                System.out.println("the number is 6");
                break; 
            case 7:
                System.out.println("the number is 7");
                break;
            case 8:
                System.out.println("the number is 8");
                break; 
            default:
                System.out.println("you did not enter a number for 1 to 8");
        }
        
        int three = 3;
        
        if (three == 7){
            System.out.println("the number is not " + three);
        }else if (three > 7){
            System.out.println("the number is not " + three);
        }else {
        System.out.println("the number is something else");
        }
        up();
        down();
        
        String [] words = { "blue", "green", "black", "purple", "red"
    };
        System.out.println(words[0]);
        System.out.println(words[4]);
        for (int i = 0; i < words.length; i++){
          System.out.println("all the colors in the string are " + words [i]);
        }
    }
    public static void up(){
        System.out.println("I am a method, yes");
    }
    public static void down(){
        System.out.println("I am also a methed");
    }
}
