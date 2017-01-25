
package javaapplication29;


public class JavaApplication29 {

    
    public static void main(String[] args) {
       
        First first = new First();
        first.setName("Godzilla");
        first.setSize("very large");
        first.setColor("green");
        first.setQuanity(1);
        first.printAnswers();
        
        First first2 = new First();
        first2.setName("MechaGodzilla");
        first2.setSize("very large");
        first2.setColor("silver");
        first2.setQuanity(3);
        first2.printAnswers();
        
        Two two = new Two();
        two.setName("Bill");
        two.setQuanity(20);
        two.setLocation("Ohio");
        two.setAmount(2);
        two.printAnswers();
        
        
    }
    
}
