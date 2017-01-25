
package javaapplication26;


public class JavaApplication26 {

   
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.bark("ruff");
       dog.color("Brown");
    }
    
}

class Dog{
    
    public String bark(String noise){
        String noiseOne = noise;
        System.out.println(noiseOne + "\t" + noiseOne +"\t" + noiseOne);
        return noiseOne;
    }
    public String color(String color){
        String colorOne = color;
        System.out.println("the color of the dog is " + colorOne);
        return colorOne;
    }
}