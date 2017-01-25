
package javaapplication21;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class JavaApplication21 {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello everybody");
       
        System.out.println(Math.pow(2,3));
        long time =  System.currentTimeMillis();
        System.out.println(time);
                
        Random random = new Random();
        int diceOne;
        int diceTwo;
        int diceThree;
        int diceFour;
        for(int i = 0; i < 20; i++){
            diceOne = random.nextInt(6) +1;
            diceTwo = random.nextInt(6) +1;
            diceThree = random.nextInt(6) +1;
            diceFour = random.nextInt(6) +1;
            System.out.println("Dice one is " + diceOne + "\t\tDice two is "
                    +diceTwo+ "\t\tDice three is " +diceThree+
                    "\t\tDice four is " +diceFour); 
        }
        
        for(int i = 5; i <= 100; i+=5){
        System.out.println(i);
        }
        
        int strong = 0;
        
        while(strong < 5){
            System.out.println("you number is " + strong);
            strong++;
        }
        
        do{
            System.out.println("your number is " + strong);
            strong++;
        }
        while(strong <= 20);
        
        if(strong == 19){
            System.out.println("your number is 19");
        }else{
            System.out.println("your number is not 19");
        }
        
        String dogColor = "brown";
        
        switch(dogColor){
            case "white":
                System.out.println("the dog is white");
                break;
            case "black":
                System.out.println("the dog is black");
                break;
            case "brown":
                System.out.println("the dog is brown");
                break;
            default:
                System.out.println("that is not a good color for a dog");
                break;  
        }
        cat("green");
        
        Name name = new Name();
        name.fullName();
    
        int [] numbers = {5,3,4,7,8,9,10};
        for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
        }
    }
    public static void cat(String c){
        String color = c;
        System.out.println("what color is the cat " + color);
    }   
}
class Name{
    Scanner scanner = new Scanner(System.in);
    public void fullName(){
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("what is you address");
        String address = scanner.nextLine();
        System.out.println("what is your age");
        String age = scanner.nextLine();
        System.out.println("what is your phone number");
        String phone = scanner.nextLine();
        System.out.println("\nyour name is " + name + " \nand you live at " + address + " \nYour phone number is " + phone + " \nand you are " + age + " years old");
        
    }
}
    
    

