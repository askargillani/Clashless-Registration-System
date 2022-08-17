/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

/**
 *
 * @author Askar G
 */
public class Book {
    String name;
    String note;
    public Book(String n, String no)
    {
        name=n;
        note=no;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getNote()
    {
        return note;
    }
}
