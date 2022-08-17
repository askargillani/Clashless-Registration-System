/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package departmentsystem;

import java.sql.ResultSet;

/**
 *
 * @author Askar G
 */
public interface Database {

    boolean addAttendance(String courseName, String rollNumber, String date, String status);

    boolean addBook(String bName, String bNote);

    Boolean addBook(String bookID, String bookName, String possessorRno);

    boolean addCourse(String cName, String tID);

    boolean addEvaluation(String courseName, String rollNumber, String Evaluation, double marks);

    boolean addHOD(String tid);

    Boolean addRegistration(String courseName, String studentRollNumber);

    boolean addStudent(String rollNumber, String firstName, String lastName, String password);

    //////////////////////////////////////////////////////////////////////////////
    Boolean addTeacher(String teacherID, String firstName, String lastName, String password);

    Boolean deleteBook(String bookID);

    Boolean deleteStudent(String rollNumber);

    Boolean deleteTeacher(String tid);

    ResultSet getBooksByBookID(String bookID);

    ResultSet getBooksByBookName(String bookName);

    ResultSet getItAssistant(String itAssistantID, String password);

    ResultSet getStudent(String rollNumber, String password);

    ResultSet getTeacher(String teacherID, String password);

    ResultSet loadAttendance();

    ResultSet loadBooks();

    ResultSet loadCourses();

    ResultSet loadEvaluations();

    ResultSet loadHOD();

    ResultSet loadRegistrations();

    ResultSet loadStudents();

    ResultSet loadTeachers();

    Boolean searchStudent(String rollNumber);

    Boolean searchTeacher(String tid);

    boolean truncateAttendance();

    boolean truncateBooksTable();

    boolean truncateCoursesTable();

    boolean truncateEvaluation();

    boolean truncateHODTable();

    boolean truncateRegistrationTable();

    boolean truncateStudentTable();

    boolean truncateTeachersTable();
    
}
