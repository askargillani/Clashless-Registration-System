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
public class Course {
    ArrayList<CourseRegistration> crList ;
    Teacher teacher;
    String courseName;
    
    public Course(String s)
    {
        courseName = s;
        crList = new ArrayList<>();
    }
    
    public String getTeacherID()
    {
        return teacher.getTeacherID();
    }
    
    public void alotTeacher(Teacher t)
    {
        teacher=t;
        t.addCourse(this);
    }
    
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public int searchCourseRegistration(String rollNumber)
    {
        int i=0;
        for(;i<crList.size();i++)
        {
            if(crList.get(i).getStudentRollNumber().equals(rollNumber))
            {
                return i;
            }
        }
        return i;
    }
    
    public CourseRegistration getCourseRegistration(String rollNumber)
    {
        
        int i=0;
        for(;i<crList.size();i++)
        {
            if(crList.get(i).getStudentRollNumber().equals(rollNumber))
            {
                return crList.get(i);
            }
        }
        return null;
    }
    
    public Boolean addCourseRegistration(CourseRegistration r)
    {
        if(r!=null)
        {
            if(searchCourseRegistration(r.getStudentRollNumber())==crList.size() || crList.isEmpty())
            {
                crList.add(r);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public int getCourseRegistrationNumber()
    {
        return crList.size();
    }
    
    public CourseRegistration getCourseRegistration(int i)
    {
        return crList.get(i);
    }

 
    public void display()
    {
        System.out.println("course name: "+courseName+",coure Teacher:"+getTeacherID());
    }
}
