
package javaapplication28;


public class JavaApplication28 {

    
    public static void main(String[] args) {
      
        Person person = new Person();
        person.setName("Robert Smith");
        person.setAddress("648 Manchester Ave. Youngstown, Ohio 44509");
        person.setAge(44);
        person.setPhoneNumber("330-272-3134");
        person.setSsn("xxx-xx-xxxx");
        person.setRace("White");
        person.printStats();
        
        Person person2 = new Person();
        person2.setName("Lisa McDonald");
        person2.setAddress("648 Manchester Ave. Youngstown, Ohio 44509");
        person2.setAge(44);
        person2.setPhoneNumber("330-402-6245");
        person2.setSsn("xxx-xx-xxxx");
        person2.setRace("White");
        person2.printStats();
        
        
    }
    
}

class Person{
   private String name;
   private int age;
   private String phoneNumber;
   private String address;
   private String ssn;
   private String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
   
   public void printStats(){
       System.out.println("your name is " + name + "\nYou live at " + address +
               "\nyour phone number is " + phoneNumber + "\nyour social security number is " +
                ssn + "\nyour age is " + age + " years old and your race is " + race + "\n");
   }
    
    
    
}