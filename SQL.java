/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

//import com.mysql.cj.jdbc.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Askar G
 */

public class SQL implements Database {
    String url="jdbc:mysql://localhost:3306/departmentsystem";
    String uname="root";
    String pass="askar3381!";
    
    @Override
    public ResultSet loadStudents()
    {
        ResultSet rs;
        try
        {
            String query = "select* from student";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public ResultSet loadBooks()
    {
        ResultSet rs;
        try
        {
            String query = "select* from books";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public ResultSet loadTeachers()
    {
        ResultSet rs;
        try
        {
            String query = "select* from teachers";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public ResultSet loadCourses()
    {
        ResultSet rs;
        try
        {
            String query = "select* from courses";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public ResultSet loadHOD()
    {
        ResultSet rs;
        try
        {
            String query = "select* from HOD";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    
    @Override
    public ResultSet loadAttendance()
    {
        ResultSet rs;
        try
        {
            String query = "select* from attendanceEntry";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
     public ResultSet loadEvaluations()
    {
        ResultSet rs;
        try
        {
            String query = "select* from evaluationEntry";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public ResultSet loadRegistrations()
    {
        
        ResultSet rs;
        try
        {
            String query = "select* from registration";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
    @Override
    public boolean truncateHODTable()
    {
        try{
            String query = "truncate table HOD";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateBooksTable()
    {
        try{
            String query = "truncate table books";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateAttendance()
    {
        try{
            String query = "truncate table attendanceEntry";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateEvaluation()
    {
        try{
            String query = "truncate table evaluationEntry";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateRegistrationTable()
    {
        try{
            String query = "truncate table registration";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateStudentTable()
    {
        try{
            String query = "truncate table student";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateTeachersTable()
    {
        try{
            String query = "truncate table teachers";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean truncateCoursesTable()
    {
        try{
            String query = "truncate table courses";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e){
            System.out.println("Not truncated: "+e);
            return false;
        }
    }
    
    @Override
    public boolean addStudent(String rollNumber,String firstName,String lastName,String password)
    {   
        try
        {
            String query = "insert into student values('"+rollNumber+"'"+",'"+firstName+"','"+lastName+"','"+password+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
        public boolean addAttendance(String courseName,String rollNumber,String date,String status)
    {   
        try
        {
            String query = "insert into attendanceEntry values('"+courseName+"'"+",'"+rollNumber+"','"+date+"','"+status+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
        
    @Override
    public boolean addEvaluation(String courseName,String rollNumber,String Evaluation,double marks)
    {   
        try
        {
            String query = "insert into evaluationEntry values('"+courseName+"'"+",'"+rollNumber+"','"+Evaluation+"','"+marks+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
    public boolean addCourse(String cName,String tID)
    {
        try
        {
            String query = "insert into courses values('"+cName+"'"+",'"+tID+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    
    
    @Override
    public boolean addBook(String bName,String bNote)
    {
        try
        {
            String query = "insert into books values('"+bName+"'"+",'"+bNote+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
        public boolean addHOD(String tid)
    {
        try
        {
            String query = "insert into HOD values('"+tid+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
        
    @Override
    public Boolean addRegistration(String courseName,String studentRollNumber)
    {
        try
        {
            String query = "insert into registration values('"+courseName+"','"+studentRollNumber+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
    public Boolean deleteStudent(String rollNumber)
    {   
        if(searchStudent(rollNumber)==true)
        {
            try
            {
                String query = "delete from student where rollNumber ='"+rollNumber+"'";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,uname,pass);
                Statement st = con.createStatement();
                st.executeUpdate(query);
                st.close();
                con.close();
                return true;
            }
            catch(Exception e)
            {
                System.out.println(e);
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public ResultSet getStudent(String rollNumber, String password)
    {
        ResultSet rs=null;
        try
        {
            String query = "select* from student where rollNumber ='"+rollNumber+"' and passkey = "+"'"+password+"'";
            System.out.println(query);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            //st.close();
            //con.close();
            //rs.next();
            //System.out.println(rs.getString(1));
            return rs;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            return rs;
        }
    }
    
    @Override
    public Boolean searchStudent(String rollNumber)
    {   
        try
        {
            String query = "select* from student where rollNumber ='"+rollNumber+"'" ;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            boolean val =rs.next();
            st.close();
            con.close();
            return val;
            
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    
    //////////////////////////////////////////////////////////////////////////////
    @Override
    public Boolean addTeacher(String teacherID,String firstName,String lastName,String password)
    {   
        try
        {
//            String process = ;
            String SQL = "{call addTeacher(?,?,?,?)}";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            CallableStatement Cmt = (CallableStatement)con.prepareCall(SQL);
            Cmt.setString(1,teacherID);
            Cmt.setString(2,firstName);
            Cmt.setString(3,lastName);
            Cmt.setString(4,password);
            Cmt.execute();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
    public Boolean deleteTeacher(String tid)
    {
        if(searchTeacher(tid))
        try
        {
//            String process = ;
            String SQL = "{call deleteTeacher(?,?)}";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            CallableStatement Cmt = (CallableStatement)con.prepareCall(SQL);
            int flag=1;
            Cmt.setString(1,tid);
            Cmt.setInt(2,flag);
            Cmt.execute();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
        else
        {return false;}
    }
    
    @Override
    public Boolean searchTeacher(String tid)
    {
        try
        {
            String query = "select* from teachers where teacherID ='"+tid+"'" ;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            boolean val =rs.next();
            st.close();
            con.close();
            return val;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
    public ResultSet getTeacher(String teacherID, String password)
    {
        ResultSet rs=null;
        try
        {
            String query = "select* from teachers where teacherID ='"+teacherID+"' and passkey = "+"'"+password+"'";
            System.out.println(query);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            //st.close();
            //con.close();
            return rs;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            return rs;
        }
    }
    
    @Override
    public ResultSet getItAssistant(String itAssistantID, String password)
    {
        ResultSet rs=null;
        try
        {
            String query = "select* from ITAssistant where itAssistantID ='"+itAssistantID+"' and passkey = "+"'"+password+"'";
            System.out.println(query);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            //st.close();
            //con.close();
            return rs;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            return rs;
        }
    }
    
    @Override
    public Boolean addBook(String bookID,String bookName,String possessorRno)
    {
        try
        {
            String query = "insert into Books values('"+bookID+"'"+",'"+bookName+"','"+possessorRno+"')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    @Override
    public ResultSet getBooksByBookName(String bookName)
    {
        ResultSet rs = null;
        try{
            String query = "select* from books where bookName ='"+bookName +"'";
            System.out.println(query);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            //st.close();
            //con.close();
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return rs;
        }
    }
    
    @Override
    public ResultSet getBooksByBookID(String bookID)
    {
        ResultSet rs = null;
        try{
            String query = "select* from books where bookID ='"+bookID +"'";
            System.out.println(query);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            //st.close();
            //con.close();
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return rs;
        }
    }
    
    @Override
    public Boolean deleteBook(String bookID)
    {
        try
        {
            ResultSet rs = getBooksByBookID(bookID);
            if(rs.next())
            {
                String query = "delete from Books where bookID = '"+bookID+"'";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,uname,pass);
                Statement st = con.createStatement();
                st.executeUpdate(query);
                st.close();
                con.close();
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
    public static void main(String[] args) {
//        SQL sql = new SQL();
//        sql.addCourse("TOA-5D",10);
        
        
    }
}
