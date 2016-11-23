# Java
Java projects
package javaapplication19; import java.util.Scanner; import java.util.Random;

public class JavaApplication19 {

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();

  Name name = new Name();
  name.name();
  Name nameOne = new Name();
  nameOne.name();

  Add add = new Add();
  add.add(20,30);

  ForLoop forLoop = new ForLoop();
  forLoop.forLoop();

  Ran ran =  new Ran();
  ran.ran();

  subtract(4,6);
  subtract(10,2);
  subtract(100,2);
}
public static void subtract(int o, int t){ int one = o; int two = t; int sum = one - two; System.out.println("the sum of the numbers is " + sum); }

}
class Name { Scanner scanner = new Scanner(System.in);

public void name(){
    System.out.println("what is you first name");
    String fName = scanner.nextLine();
    System.out.println("What is your last name");
    String lName = scanner.nextLine();
    System.out.println("What is your address");
    String address = scanner.nextLine(); 
    System.out.println("what is you phone number");
    String phone = scanner.nextLine();
    System.out.println("Your name is " + fName + " " + lName);
    System.out.println("Your address is " + address);
    System.out.println("Your phone number is " + phone);
}
} class Add{ public void add(int f, int s){ int one = f; int two = s; int total = one + two; System.out.println(total);

}
} class ForLoop{ public void forLoop(){ for(int i = 0; i < 100; i+=5) System.out.println(i); } } class Ran{ public void ran(){ int [] one = {3,2,5,8,9,0,12}; for(int i = 0; i < one.length; i++) System.out.println(one [i]);

}
}
