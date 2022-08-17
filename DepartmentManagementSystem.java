/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package departmentsystem;

/**
 *
 * @author Askar G
 */
public class DepartmentManagementSystem {

    /**
     * @param args the command line arguments
     */
    /*
    addEvaluation(String rollNumber,String courseName,String evalName,double marks);
    updateEvaluation(String rollNumber,String courseName,String evalName,double marks);
    updateEvaluation(String rollNumber,String courseName,String evalName,String newEvalName);
    removeEvaluation(String rollNumber,String courseName,String evalName);
    same goes for attendance
    alotGrade(String rollNumber,String courseName);
    createStudent();
    createTeacher();
    createCourse();
    registerCourse(String rollNumber,String courseName);
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ControllerClass c = new ControllerClass();
        new loginGui(c);
    }
    
}
