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
public class Student extends Person {
    String rollNumber;
    ArrayList<CourseRegistration> crList;
    
    
    public int getRegistrationsNumber()
    {
        return crList.size();
    }
    
    CourseRegistration getCourseRegistration(int i)
    {
        if(i<crList.size())
            return crList.get(i);
        else
            return null;
    }
    
    void displayCourseRegistrations()
    {
        for(int i=0;i<crList.size();i++)
        {
            System.out.println(crList.get(i).getCourseName()+","+crList.get(i).getStudentRollNumber());
        }
    }
    
    public Student()
    {
        super();
        rollNumber="";
        crList = new ArrayList<>();
    }
    
    String[] getRegisteredCourses()
    {
        String[] coursesList= new String[100];
        for(int i=0;i<crList.size();i++)
        {
            coursesList[i]=crList.get(i).getCourseName();
        }
        return coursesList;
    }
    
    public int searchCourseRegistration(String courseName)
    {
        int i=0;
        for(;i<crList.size();i++)
        {
            if(crList.get(i).getCourseName().equals(courseName))
            {
                return i;
            }
        }
        return i;
    }
    
    public void addAttendanceEntry(String course,String date,char c)
    {
        getCourseRegistration(searchCourseRegistration(course)).addEntry(date, c);
    }
    
    public void addEvaluationEntry(String course,String evaluation,double marks)
    {
        getCourseRegistration(searchCourseRegistration(course)).addEvaluation(evaluation, marks);
    }
    
    public ArrayList<String> getDates(String courseName)
    {
        ArrayList<String> dates = new ArrayList<>();
        for(int i=0;i<getCourseRegistration(searchCourseRegistration(courseName)).noOfDays();i++)
        {
            dates.add (getCourseRegistration(searchCourseRegistration(courseName)).getEntry(i).date);
        }
        return dates;
    }
    
    public ArrayList<String> getEvaluations(String courseName)
    {
        ArrayList<String> evaluations = new ArrayList<>();
        for(int i=0;i<getCourseRegistration(searchCourseRegistration(courseName)).noOfEvaluations();i++)
        {
            evaluations.add (getCourseRegistration(searchCourseRegistration(courseName)).getEvaluation(i).evaluationName);
        }
        return evaluations;
    }
    
    public ArrayList<String> getStatus(String courseName)
    {
        ArrayList<String> dates = new ArrayList<>();
        for(int i=0;i<getCourseRegistration(searchCourseRegistration(courseName)).noOfDays();i++)
        {
            dates.add(Character.toString(getCourseRegistration(searchCourseRegistration(courseName)).getEntry(i).status));
        }
        return dates;
    }
    
    public ArrayList<String> getMarks(String courseName)
    {
        ArrayList<String> dates = new ArrayList<>();
        for(int i=0;i<getCourseRegistration(searchCourseRegistration(courseName)).noOfEvaluations();i++)
        {
            dates.add(""+getCourseRegistration(searchCourseRegistration(courseName)).getEvaluation(i).marks);
        }
        return dates;
    }
    
    public boolean addCourseRegistration(CourseRegistration e)
    {
        int i=searchCourseRegistration(e.getCourseName());
        if(i==crList.size()){
        crList.add(e);
        e.getCourse().addCourseRegistration(e);
        return true;
        }
        return false;
    }
    
    public Student(String rollNo,String firstName,String lastName,String password)
    {
        super(firstName,lastName,password);
        rollNumber=rollNo;
        crList = new ArrayList<>();
    }
    
    String getRollNumber()
    {
        return rollNumber;
    }
    
    @Override public void display()
    {
        super.display();
        System.out.println("RollNumber: "+rollNumber);
        System.out.println(crList.size());
        for(int i=0;i<crList.size();i++)
        {
            System.out.println(crList.get(i).getCourseName());
        }
    }
    
    public void updateRollNumber(String rollno)
    {
        rollNumber=rollno;
    }
    
    int noOfRegistrations()
    {
        return crList.size();
    }
    
    
    public boolean saveStudentAttendance()
   {
       SQL sql = new SQL();
       boolean flag=true;
       for(int i=0;i<crList.size();i++)
       {
           for(int j=0;j<crList.get(i).noOfDays();j++)
           {
               sql.addAttendance(crList.get(i).getCourseName(),crList.get(i).getStudentRollNumber(),crList.get(i).getEntry(j).date,Character.toString(crList.get(i).getEntry(j).status) );
           }
       }
       return flag;
   }
    
    public boolean saveStudentEvaluation()
   {
       SQL sql = new SQL();
       boolean flag=true;
       for(int i=0;i<crList.size();i++)
       {
           for(int j=0;j<crList.get(i).noOfEvaluations();j++)
           {
               sql.addEvaluation(crList.get(i).getCourseName(),crList.get(i).getStudentRollNumber(),crList.get(i).getEvaluation(j).evaluationName,crList.get(i).getEvaluation(j).marks );
           }
       }
       return flag;
   }
    
    public static void main(String[] args) {
        Student s = new Student("19L-1136","Askar","Hussain","askar1136");
        Course c = new Course("Toa");
        CourseRegistration r = new CourseRegistration();
        r.alotCourseAndStudent(c, s);
        s.addCourseRegistration(r);
        Course c2 = new Course("To2a");
        CourseRegistration r2 = new CourseRegistration();
        r2.alotCourseAndStudent(c2, s);
        s.addCourseRegistration(r2);
        s.display();
    }
}
