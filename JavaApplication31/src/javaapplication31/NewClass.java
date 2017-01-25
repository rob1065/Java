
package javaapplication31;


public class NewClass {
    private int employeeNumber;
    private String name;
    private String address;
    private String phoneNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void printInfo(){
        System.out.println("Employee number is " + employeeNumber);
        System.out.println("The employee's name is " + name);
        System.out.println("The employee's address is " + address);
        System.out.println("The employee's phone number is " + phoneNumber);
    }
}
