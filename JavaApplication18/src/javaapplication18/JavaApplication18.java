
package javaapplication18;
import java.util.Scanner;
import java.util.Random;

public class JavaApplication18 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playerHealth = 100;
        int playerMaxAttackDamage = 20;
        int numberOfHealthPotions = 5;
        int healthPotionAmount = 25;
        int healthPotionFindChance = 50;
        
        String [] enemys = { "monster", "dragon", "orc", "deamon", "dark elf", "evil nome"};
        int enemyMaxHealth = 75;
        int enemyMaxAttackDamage = 20;
        
        boolean run = true;
        GAME:
        while(run){
           System.out.println("----------------------------------------");
           
           int enemyHealth = random.nextInt(enemyMaxHealth);
           String enemy = enemys[random.nextInt(enemys.length)];
           System.out.println("\tOh no, a " + enemy + " has showed up");
           
           while(enemyHealth > 0){
               System.out.println("\tYour health is " + playerHealth);
               System.out.println("\tthe " + enemy + " health is " + enemyHealth );
               System.out.println("\twhat do you want to do\n");
               System.out.println("\t1. attack");
               System.out.println("\t2. drink potion");
               System.out.println("\t3. run away");
               
               String choice = scanner.nextLine();
               if(choice.equals("1")){
                   int damageGiven = random.nextInt(playerMaxAttackDamage);
                   int damageTaken = random.nextInt(enemyMaxAttackDamage);
                   
                   enemyHealth -= damageGiven;
                   playerHealth -= damageTaken;
                   
                   System.out.println("the " + enemy + " strikes you and you loose " + damageTaken + " health");
                   System.out.println("you strike the " + enemy + " and it looses " + damageGiven + " health\n");
                   
                    if(playerHealth < 1){
                        System.out.println("\tyou do not have enough health to continue\n");
                        break;
                    }
               }
               else if(choice.equals("2")){
                   if(numberOfHealthPotions > 0){
                       playerHealth += healthPotionAmount;
                       numberOfHealthPotions--;
                       System.out.println("\tyou have taken a health potion, you now have "+ playerHealth+ " health");
                       System.out.println("\tyou have " +numberOfHealthPotions + " health potions left");
                   }
                   else {
                       System.out.println("you have no health potions left");
                   }
               }
               else if(choice.equals("3")){
                   System.out.println("you run away from the " + enemy);
                   continue GAME;
               }
               else {
                   System.out.println("you entered a invaled number");
                   
               }
               
           }
           if(playerHealth < 1){
               System.out.println("you limp out of the battle, too weak to continue\n");
               break;
           }
           System.out.println("------------------------------------------");
           System.out.println("the " + enemy + " is dead");
           System.out.println("you have " + playerHealth + " health left");
           if(random.nextInt (100) < (healthPotionFindChance)){
              numberOfHealthPotions++;
              System.out.println("the " + enemy + " left you a health potion");
              System.out.println("you now have " + numberOfHealthPotions + " left");
           }
           System.out.println("------------------------------------------");
           System.out.println("what do you want to do now\n");
           System.out.println("enter 1 to keep fighting");
           System.out.println("enter 2 to exit the game");
           
           String answer = scanner.nextLine();
           
           while(!answer.equals("1") && !answer.equals("2")){
               System.out.println("not a valid number");
               answer = scanner.nextLine();
           }
           if(answer.equals("1")){
               System.out.println("good luck and keep winning\n");
           }
           else if(answer.equals("2")){
            System.out.println("you exit the challenge\n");
            break;
        }
        }
        System.out.println("Thank you for playing my first game");
        
    }
}
    
    

