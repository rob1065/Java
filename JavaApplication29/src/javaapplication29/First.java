
package javaapplication29;


public class First {
    private String name;
    private String size;
    private String color;
    private int quanity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    
    public void printAnswers(){
        System.out.println("The monsters name is " + name + "\nThe monster is " + 
                color + "\nThe size of the monster is " + size + "\nThere are " + 
                quanity + " of this type of monster\n");
    }
    
}
