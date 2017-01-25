
package javaapplication30;


public class Animals {
    private String name;
    private String color;
    private int refNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }
    
    public void printA(){
        System.out.println("The name of the animal is " + name + 
                " \nThe color of your animal is " + color + 
                " \nThe referance number for your animal is " + refNumber);
    }
}
