package javaapplication32;

import java.util.Scanner;

public class JavaApplication32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("pick a number between 1 and 10");
        int guessNumber = scanner.nextInt();

        int random = (int) (Math.random() * 10);

        if (guessNumber < 1 || guessNumber > 10) {
            System.out.println("you did not guess a number between 1 and 10");

        } else if (guessNumber == random) {
            System.out.println("you guessed the right number, the number was " + random);
        } else {
            System.out.println("you guessed the wrong number, the number was " + random);
        }
    }

}
