package javaapplication31;

import java.util.Scanner;
import java.util.Date;

public class JavaApplication31 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //even or odd number
        int x;
        System.out.println("Enter a number to see if it is even or odd ");
        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("you entered an even number.");
        } else {
            System.out.println("You entered an odd number.");
        }

        //star pattern for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //reverse star pattern for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //enter information and display it
        Scanner one = new Scanner(System.in);
        System.out.println("what is your name");
        String name = one.nextLine();
        System.out.println("What is your favorite color");
        String color = one.nextLine();
        System.out.println("Your name is " + name
                + " \nand your favorite color is " + color);

        //while loop
        int age = 4;

        while (age < 10) {
            System.out.println(age);
            age++;
        }
        //if statement
        int bike = 35;
        if (bike == 10) {
            System.out.println("the bike is not 35");
        } else {
            System.out.println("the bike must be 35");
        }
        //case statement
        int amount = 4;

        switch (amount) {
            case 1:
                System.out.println("amount is 1");
                break;
            case 2:
                System.out.println("amount is 2");
                break;
            case 3:
                System.out.println("amount is 3");
                break;
            case 4:
                System.out.println("amount is 4");
                break;
            default:
                System.out.println("amount was not 1,2,3 or 4");
        }
        //method dog
        dog();

        //array
        String[] books = {"one", "two", "three", "four"
        };
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        //date and timd
        Date date = new Date();
        System.out.println(date);

        //try and catch
        String welcome = "welcome";
        char[] chars = welcome.toCharArray();
        try {
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //a new class
        NewClass newClass = new NewClass();
        newClass.setEmployeeNumber(1001);
        newClass.setName("Jim Donavan");
        newClass.setAddress("1125 First Street Youngstown, Ohio 44501");
        newClass.setPhoneNumber("330-223-2345");
        newClass.printInfo();
        
        //new class Fruit
        Fruit fruit = new Fruit();
        fruit.color();
        fruit.shape();
        fruit.size();
       
        //new class Apple extends Fruit
        Apple apple = new Apple();
        apple.color();
        apple.setName("Red Delishous");
        apple.setFarm("Big Apple Farm");
        apple.printApple();
        
        Apple apple2 = new Apple();
        apple2.setName("Granny Smith");
        apple2.setFarm("Old Granny Apple Farm");
        apple2.printApple();
    }

    //method dog
    public static void dog() {
        System.out.println("I have a dog");
    }

}
