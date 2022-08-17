/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Askar G
 */
public class Teacher extends Person {
    String teacherID;
    ArrayList<Course> cList;
    public Teacher()
    {
        super();
        teacherID="";
        cList = new ArrayList<>();
    }
    
    public boolean addCourse(Course c)
    {
        int i=0;
        boolean flag=true;
        while(i<cList.size())
        {
            if(cList.get(i)==c)
            {flag=false;}
            i++;
        }
        if(flag==true)cList.add(c);
        return flag;
    }
    
    public ArrayList<String> getCourseNames()
    {
        ArrayList<String> courseNames= new ArrayList<>();
        for(int i=0;i<cList.size();i++)
        {
            courseNames.add(cList.get(i).getCourseName());
        }
        return courseNames;
    }
    
    public int searchCourse(String courseName)
    {
        for(int i=0;i<cList.size();i++)
        {
            if(courseName.equals(cList.get(i).getCourseName()))
            {
                return i;
            }
        }
        return cList.size();
    }
    
    public ArrayList<String> getStudentsTaught(String courseName)
    {
        ArrayList<String> studentNames = new ArrayList<>();
        Course c = cList.get(searchCourse(courseName));
        for(int i=0;i<c.getCourseRegistrationNumber();i++)
        {
            studentNames.add(c.getCourseRegistration(i).getStudentRollNumber());
        }
        return studentNames;
    }
    
    public Teacher(String teacherID,String firstName,String lastName,String password)
    {
        super(firstName,lastName,password);
        this.teacherID=teacherID;
        cList=new ArrayList<>();
    }
    
    @Override public void display()
    {
        super.display();
        System.out.println("TeacherID: "+teacherID);
    }
    
    public void updateTeacherID(String teacherID)
    {
        this.teacherID=teacherID;
    }
    
    public String getTeacherID()
    {
        return teacherID;
    }
    
    public static void main(String[] args) {
        Teacher t=new Teacher("Iqra","Yaqoot","askar3381!","2134");
        t.display();
        t.updateFirstName("Askar");
        t.display();
    }
}
