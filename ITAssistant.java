/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

/**
 *
 * @author Askar G
 */
public class ITAssistant extends Person {

    String itAssistantID;

    public ITAssistant() {
        super();
        itAssistantID = "";
    }

    public ITAssistant(String firstName, String lastName,String password, String itAssistantID) {
        super(firstName, lastName,password);
        this.itAssistantID = itAssistantID;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("RollNumber: " + itAssistantID);
    }

    public void updateITAssistantID(String itAssistantID) {
        this.itAssistantID = itAssistantID;
    }
}
