
package javaapplication31;


public class Apple extends Fruit{
    private String name;
    private String farm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }
    
    public void printApple(){
        System.out.println("The name of the apple is " + name);
        System.out.println("The name of the apple farm is " + farm);
    }
}
