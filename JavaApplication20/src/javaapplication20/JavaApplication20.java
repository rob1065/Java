
package javaapplication20;
import java.util.Scanner;

public class JavaApplication20 {

    
    public static void main(String[] args) {
      
      Id id = new Id();
      id.name();
      
      Loop loop = new Loop();
      loop.forLoop();
      loop.reverseForLoop();
    }
    
}

 class Id {
    public void name(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ");
        String fName = scanner.nextLine();
        System.out.println("what is your age ");
        String age = scanner.nextLine();
        System.out.println("What is your address ");
        String address = scanner.nextLine();
        System.out.println("what is your phone number ");
        String phone = scanner.nextLine();
        System.out.println("Your name is " + fName + " and you are " + age + " years old");
        System.out.println("Your address is " + address );
        System.out.println("your phone number is " + phone);
    }
 }
 class Loop{
     public static void forLoop(){
     for(int i = 0; i < 100; i+=10){
         System.out.println(i);
     }
     }
     public static void reverseForLoop(){
         for(int i = 100; i > 0; i-=10){
             if(i == 20){
               System.out.println("this is twenty");
             }
             System.out.println(i);
         }
     }
  }
 
 