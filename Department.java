/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;
import java.sql.*;

import java.util.ArrayList;

/**
 *
 * @author Askar G
 */
public final class Department {
   ArrayList<Student> sList; 
   ArrayList<Teacher> tList;
   ArrayList<Course> cList;
   ArrayList<Book> bList;
   
   
   public Department()
   {
       sList = new ArrayList<>();
       tList = new ArrayList<>();
       cList = new ArrayList<>();
       bList = new ArrayList<>();
   }
   
    
   
   public Teacher getTeacher(int i)
   {
       return tList.get(i);
   }
   
   public int searchStudent(String rollNumber)
   {
       int i=0;
       for(;i<sList.size();i++)
       {
           if(rollNumber.equals(sList.get(i).getRollNumber()))
           {
               return i;
           }
       }
       return i;
   }
   

   
   public boolean addStudent(Student s)
   {
       SQL sql = new SQL();
       if(s!=null)
       {
           int i = searchStudent(s.getRollNumber());
           if(i==sList.size())
           {
               sList.add(s);
               return true;
           }
           return false;
       }
       return false;
   }
   
   public boolean addCourse(Course c)
   {
       if(c!=null)
       {
           int i = searchCourse(c.getCourseName());
           if( i == cList.size() )
           {
               cList.add(c);
               return true;
           }
           return false;
       }
       return false;
   }
   
   
  
   
   public Course getCourse(int i)
   {
       if(i<cList.size())
           return cList.get(i);
       else
           return null;
   }
   
   public boolean saveRegistrations()
   {
       SQL sql = new SQL();
       boolean flag=true;
       for(int i=0;i<cList.size();i++)
       {
           for(int j=0;j<cList.get(i).getCourseRegistrationNumber();j++)
           {
               flag = sql.addRegistration(cList.get(i).getCourseRegistration(j).getStudentRollNumber(),cList.get(i).getCourseRegistration(j).getCourseName());
           }
       }
       return flag;
   }
   
   public boolean saveStudents()
   {
       SQL sql = new SQL();
       sql.truncateStudentTable();
       boolean flag=true;
       for(int i=0;i<sList.size();i++)
       {
           flag=sql.addStudent(sList.get(i).getRollNumber(),sList.get(i).getFirstName(),sList.get(i).getLastName(),sList.get(i).getPassword());
       }
       return flag;
   }
   
   public void saveAttendance()
   {
       for(int i=0;i<sList.size();i++)
       {
           sList.get(i).saveStudentAttendance();
       }
   }
   
   public void saveEvaluation()
   {
       for(int i=0;i<sList.size();i++)
       {
           sList.get(i).saveStudentEvaluation();
       }
   }
   
   public boolean saveTeachers()
   {
       SQL sql = new SQL();
       sql.truncateTeachersTable();
       boolean flag=true;
       for(int i=0;i<tList.size();i++)
       {
           flag=sql.addTeacher(tList.get(i).getTeacherID(),tList.get(i).getFirstName(),tList.get(i).getLastName(),tList.get(i).getPassword());
       }
       return flag;
   }
   
    public boolean saveCourses()
    {
       SQL sql = new SQL();
       sql.truncateCoursesTable();
       boolean flag=true;
       for(int i=0;i<cList.size();i++)
       {
           flag=sql.addCourse(cList.get(i).getCourseName(),cList.get(i).getTeacherID());
       }
       return flag;
    }
    
    public Book searchBook(String book)
    {
        Book b = null;
        for(int i=0;i<bList.size();i++)
        {
            if(bList.get(i).getName().equals(book))
            {
                b = new Book(bList.get(i).getName(),bList.get(i).getNote());
                
            }
        }
        return b;
    }
    
    public Boolean lendBook(String book)
    {
        for(int i=0;i<bList.size();i++)
        {
            if(bList.get(i).getName().equals(book))
            {
                bList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean saveBooks()
    {
       SQL sql = new SQL();
       sql.truncateBooksTable();
       boolean flag=true;
       for(int i=0;i<bList.size();i++)
       {
           flag=sql.addBook(bList.get(i).getName(),bList.get(i).getNote());
       }
       return flag;
    }
    

   
   void displayStudents()
   {
       for(int i=0;i<sList.size();i++)
       {
           sList.get(i).display();
           System.out.println("------------------------------------------------");
       }
   }
   
   public int searchTeacher(String id)
   {
       int i=0;
       for(;i<tList.size();i++)
       {
           if(id.equals(tList.get(i).getTeacherID()))
           {
               return i;
           }
       }
       return i;
   }
   
      public int searchCourse(String name)
   {
       int i=0;
       for(;i<cList.size();i++)
       {
           if(name.equals(cList.get(i).getCourseName()))
           {
               return i;
           }
       }
       return i;
   }
   
   public boolean addTeacher(Teacher t)
   {
       SQL sql = new SQL();
       if(t!=null)
       {
           int i = searchTeacher(t.getTeacherID());
           if(i==tList.size())
           {
               tList.add(t);
               return true;
           }
           return false;
       }
       return false;
   }
   
   void displayTeachers()
   {
       for(int i=0;i<tList.size();i++)
       {
           tList.get(i).display();
           System.out.println("------------------------------------------------");
       }
   }
   
   void displayCourses()
   {
       for(int i=0;i<cList.size();i++)
       {
           cList.get(i).display();
           System.out.println("------------------------------------------------");
       }
   }
   
   

   
   public int noOfStudents()
   {
       return sList.size();
   }
   
   public int noOfCourses()
   {
       return cList.size();
   }
   
   public Teacher getTeacher(String name)
   {
       for(int i=0;i<tList.size();i++)
       {
           if(tList.get(i).getTeacherID().equals(name))
           {
               return tList.get(i);
           }
       }
       return null;
   }
   
   public int noOfTeachers()
   {
       return tList.size();
   }
   
   public Student getStudent(String rollNumber)
   {
       return sList.get(searchStudent(rollNumber));
   }
   
   public Course getCourse(String courseName)
   {
       return cList.get(searchCourse(courseName));
   }
   
   public void addBook(Book b)
   {
       bList.add(b);
   }
   
    public static void main(String[] args) {
    }
    
    String[] getAllCourses()
    {
        String[] coursesArray = new String[cList.size()];
        for(int i=0;i<cList.size();i++)
        {
            coursesArray[i]=cList.get(i).getCourseName();
        }
        return coursesArray;
    }
    
    void displayStudentRegistrations()
    {
        for(int i=0;i<sList.size();i++)
        {
            sList.get(i).displayCourseRegistrations();
        }
        
    }
    
    void emptyStudents()
    {
        sList.clear();
    }
    
    void emptyBooks()
    {
        bList.clear();
    }
    
    void emptyTeachers()
    {
        tList.clear();
    }
    
    void emptyCourses()
    {
        cList.clear();
    }
    
//    void displayBooks()
//    {
//        for(int i=0;i<bList.size();i++)
//        {
//            System.out.println(bList.get(i).getName());
//        }
//    }
   
}
