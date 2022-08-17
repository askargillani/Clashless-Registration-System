/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

/**
 *
 * @author Askar G
 */
abstract public class Person {
    String firstName;
    String lastName;
    String password;
    
    public Person(){
        firstName="";
        lastName="";
        password="";
    }
    
    public Person(String firstName,String lastName,String password)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
    }
    
    public void updateFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    
    public void updateLastName(String lastName)
    {
        this.lastName=lastName;
    }
    
    public void updatePassword(String password)
    {
        this.password=password;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void display()
    {
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Password: "+password);
    }
}
