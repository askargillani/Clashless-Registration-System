/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentsystem;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Askar G
 */
public class AttendanceEntryAuthentication {
    static Boolean authenticateDate(String date)
    {
        int count = 0;
        String dateYear = new String();
        String dateMonth = new String();
        String dateDay = new String();
        for(int i=0;i<date.length();i++)
        {
            if(date.charAt(i)>=48 && date.charAt(i)<=57)
            {
                if(count == 0) dateYear=dateYear + date.charAt(i);
                if(count == 1) dateMonth = dateMonth + date.charAt(i);
                if(count == 2) dateDay = dateDay + date.charAt(i);
            }
            else if(date.charAt(i)=='-')
            {
                count++;
            }
            else
                return false;
        }
        if(count == 2)
        {
            int dateY = parseInt(dateYear);
            int dateM = parseInt(dateMonth);
            int dateD = parseInt (dateDay);
            return (dateY > 2000 && dateY < 2100 && dateM >= 1 && dateM <= 12 && dateD >= 1 && dateD <= 31);
        }
        else
            return false;
    }
    
    static String indentDate(String date)
    {
        int count = 0;
        String dateYear = new String();
        String dateMonth = new String();
        String dateDay = new String();
        for(int i=0;i<date.length();i++)
        {
            if(date.charAt(i)>=48 && date.charAt(i)<=57)
            {
                if(count == 0) dateYear=dateYear + date.charAt(i);
                if(count == 1) dateMonth = dateMonth + date.charAt(i);
                if(count == 2) dateDay = dateDay + date.charAt(i);
            }
            else if(date.charAt(i)=='-')
            {
                count++;
            }
        }
        int dateY = parseInt(dateYear);
        int dateM = parseInt(dateMonth);
        int dateD = parseInt (dateDay);
        String indentedDate = Integer.toString(dateY)+"-"+Integer.toString(dateM)+"-"+Integer.toString(dateD);
        return indentedDate;
    }
    
    static Boolean authenticateStatus(char status)
    {
        return status == 'P' || status == 'A';
    }
    
    public static void main(String[] args) {
        if(AttendanceEntryAuthentication.authenticateDate("2021-031-31"))
            System.out.println("Correct date");
        else
            System.out.println("incorrect date");
        
    }
    
}
