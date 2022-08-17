/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;
/**
 *
 * @author Askar G
 */
public class CourseRegistration {
    Course course;
    Student std;
    Attendance attendance;
    String grade;
    Evaluations evaluations;
    public CourseRegistration()
    {
        grade="U";
        evaluations = new Evaluations();
        attendance = new Attendance();
    }
    
    int noOfEvaluations()
    {
        return evaluations.noOfEvaluations();
    }
    
    
    public String getStudentRollNumber()
    {
        return std.getRollNumber();
    }
    
    public String getCourseName()
    {
        return course.getCourseName();
    }
    
    public Course getCourse()
    {return course;}
    
    public void alotCourseAndStudent(Course c,Student s)
    {
        std = s;
        course = c;
    }
    
    public void alotGrade(String grade)
    {
        this.grade = grade;
    }
    
    public boolean addEvaluation(String evalName,double marks)
    {
        return evaluations.addEvaluation(evalName, marks);

    }
    
    public Boolean removeEvaluation(String evalName)
    {
        return evaluations.removeEvaluation(evalName);
    }
    
    public Boolean updateEvaluation(String evalName)
    {
        return evaluations.updateEvaluation(evalName);
    }
    
    public Boolean updateEvaluation(String evalName,double marks)
    {
        return evaluations.updateEvaluation(evalName, marks);
    }
    
    public Boolean addEntry(String date,char status)
    {
        return attendance.addEntry(date,status);
    }
    
    public Boolean deleteEntry(String date)
    {
        return attendance.deleteEntry(date);
    }
    
    public Boolean updateEntryDate(String date)
    {
        return attendance.updateEntryDate(date);
    }
    
    public Boolean updateEntryStatus(String date,char status)
    {
        return attendance.updateEntryStatus(date,status);
    }
    
    public int noOfDays()
    {
        return attendance.noOfEntries();
    }
    
    AttendanceEntry getEntry(int i)
    {
        return attendance.getEntry(i);
    }
    
    EvaluationEntry getEvaluation(int i)
    {
        return evaluations.getEvaluation(i);
    }
    
    void display()
    {
        std.display();
        course.display();
        attendance.display();
        evaluations.display();
    }
    
    public static void main(String[] args) {
        CourseRegistration a= new CourseRegistration();
        Student s = new Student("19L-1136","Askar","Hussain","askar3381!");
        Course c = new Course ("TOA-5D");
        Teacher t = new Teacher("CS-123","Amir","Raheem","amir123!");
        c.alotTeacher(t);
        //c.addCourseRegistration(a, s);
        a.addEntry("2012-06-12", 'A');
        a.addEntry("2012-07-12", 'A');
        a.addEntry("2012-06-12", 'P');
        a.addEvaluation("Quiz 1",12.75);
        a.addEvaluation("Quiz 2",32.32);
        a.display();
    }
    
}
