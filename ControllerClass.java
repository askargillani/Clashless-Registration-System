/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

import java.sql.ResultSet;

/**
 *
 * @author Askar G
 */
public class ControllerClass {
    Department d;
    FactoryCreator f;
            
    ControllerClass()
    {
        d = new Department();
        f = new FactoryCreator();
//        loadStudents();
//        loadTeachers();
//        loadCourses();
//        loadBooks();
//        loadAttendance();
    }
    
    
    public void addBook(String name,String note)
    {
        Book b = new Book(name,note);
        d.addBook(b);
    }
    
    
    
    
    public String searchBook(String book)
    {
        Book b = d.searchBook(book);
        if(b!=null)
        {
            return b.note;
        }
        else
            return null;
    }
    
    
    public boolean lendBook(String book)
    {
        return d.lendBook(book);
    }
    
    
    public boolean addStudent(String rollNumber,String firstName,String lastName,String password)
    {
        Student s = new Student(rollNumber,firstName,lastName,password);
        return d.addStudent(s);
        
    }
    

    
    
    public boolean loadBooks()
    {
        try{
            d.emptyBooks();
            Database sql = f.createSql();
            ResultSet rs = sql.loadBooks();

            while(rs.next())
            {
               Book b = new Book(rs.getString(1),rs.getString(2));
               d.addBook(b);
            }
//            d.displayBooks();
            return true;
        }
        catch(Exception e)
        {
           System.out.println("students not fetched: "+e);
           return false;
        } 
    }
    
    
    
    public boolean loadAttendance()
    {

        try{
            Database sql = f.createSql();
            ResultSet rs = sql.loadAttendance();

            while(rs.next())
            {
               String courseName = rs.getString(1);
               String rollNumber = rs.getString(2);
               String attendanceDate = rs.getString(3);
               String status = rs.getString(4);
               char s =status.charAt(0);
               Student std = d.getStudent(rollNumber);
               std.addAttendanceEntry(courseName, attendanceDate, s);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("attendance not fetched: "+e);
           return false;
        } 
    }


   
    public boolean loadEvaluations()
    {
        try{
            Database sql = f.createSql();
            ResultSet rs = sql.loadEvaluations();

            while(rs.next())
            {
               String courseName = rs.getString(1);
               String rollNumber = rs.getString(2);
               String evaluation = rs.getString(3);
               double marks = rs.getDouble(4);
               Student std = d.getStudent(rollNumber);
               std.addEvaluationEntry(courseName, evaluation, marks);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("attendance not fetched: "+e);
           return false;
        } 
    }    
    
    
    public void saveStudentsAttendance()
    {
        Database sql = f.createSql();
        sql.truncateAttendance();
        d.saveAttendance();
    }
    
    
    public void saveStudentsEvaluations()
    {
        Database sql = f.createSql();
        sql.truncateEvaluation();
        d.saveEvaluation();
    }
    
    
    public Teacher getTeacher(String id)
    {
        return d.getTeacher(id);
    }
    
    
    
    public boolean loadStudents()
    {
        try{
            d.emptyStudents();
            Database sql = f.createSql();
            ResultSet rs = sql.loadStudents();

            while(rs.next())
            {
               Student s = new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
               d.addStudent(s);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("students not fetched: "+e);
           return false;
        } 
    }
    
    
    public boolean loadRegistrations()
    {
        try{
            Database sql = f.createSql();
            ResultSet rs = sql.loadRegistrations();

            while(rs.next())
            {
               CourseRegistration r = new CourseRegistration();
               Student s = d.getStudent(rs.getString(1));
               Course c = d.getCourse(rs.getString(2));
               r.alotCourseAndStudent(c, s);
               s.addCourseRegistration(r);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("teachers not fetched: "+e);
            return false;
        }
    }
    
    
    public boolean loadTeachers()
    {
        try{
            d.emptyTeachers();
            Database sql = f.createSql();
            ResultSet rs = sql.loadTeachers();

            while(rs.next())
            {
               Teacher t = new Teacher(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
               d.addTeacher(t);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("teachers not fetched: "+e);
            return false;
        }
       
    }
    
    
    public boolean loadCourses()
    {
        try{
            d.emptyCourses();
            Database sql = f.createSql();
            ResultSet rs = sql.loadCourses();

            while(rs.next())
            {
               Course c = new Course(rs.getString(1));
               String tid = rs.getString(2);
               Teacher t=d.getTeacher(d.searchTeacher(tid));
               c.alotTeacher(t);
               d.addCourse(c);
            }
            return true;
        }
        catch(Exception e)
        {
           System.out.println("Courses not fetchede: "+e);
            return false;
        }
       
    }
    
   
    public boolean saveRegistrations()
    {
        Database sql = f.createSql();
        sql.truncateRegistrationTable();
        return d.saveRegistrations();
    }

    
    public boolean saveBooks()
    {
            Database sql = f.createSql();
            sql.truncateBooksTable();
            return d.saveBooks();
    }
    
    
    public boolean saveStudents()
    {
            Database sql = f.createSql();
            sql.truncateStudentTable();
            return d.saveStudents();
    }
    
    
    public boolean saveTeachers()
    {
            Database sql = f.createSql();
            sql.truncateTeachersTable();
            return d.saveTeachers();
    }
    
    
    public boolean saveCourses()
    {
            Database sql = f.createSql();
            sql.truncateCoursesTable();
            d.displayCourses();
            return d.saveCourses();
    }
    
    
    public void displayStudents()
    {
        d.displayStudents();
    }
    
    
    public boolean addTeacher(String id,String firstName,String lastName,String password)
    {
        Teacher t = new Teacher(id,firstName,lastName,password);
        return d.addTeacher(t);    
    }
    
    
    public boolean addCourse(String courseName,String teacherID)
    {
        int i=d.searchTeacher(teacherID);
        if(i<d.noOfTeachers())
        {
            Course c = new Course(courseName);
           Teacher t=d.getTeacher(d.searchTeacher(teacherID));
            c.alotTeacher(t);
            d.addCourse(c);
            t.addCourse(c);
            return true;
        }
        else
            return false;
    }
    
    
    
    public boolean registerCourses(String courseName,Student s)
    {
        CourseRegistration r = new CourseRegistration();
        Course c = d.getCourse(d.searchCourse(courseName));
        r.alotCourseAndStudent(c, s);

        return s.addCourseRegistration(r);
    }
    
    
    public void displayTeachers()
    {
        d.displayTeachers();
    }
    
    
    public void displayCourses()
    {
        d.displayCourses();
    }
    
    
    public String[] getAllCourses()
    {
        return d.getAllCourses();
    }
    
    
    public Student getStudent(String s)
    {
        return d.getStudent(s);
    }
    
    
    public void displayCourseRegistrations()
    {
        d.displayStudentRegistrations();
    }
    
    
    
    
    public static void main(String[] args) {
        ControllerClass c=new ControllerClass();
        c.displayStudents();
        c.displayTeachers();
        c.displayCourses();
    }
    
}
