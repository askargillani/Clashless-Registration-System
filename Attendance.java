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
//import java.util.Arrays;

public class Attendance {
    ArrayList<AttendanceEntry> entryList;
    public Attendance()
    {
        entryList = new ArrayList<>();
    }
    
    int noOfEntries()
    {return entryList.size();}
    
    public int searchEntry(String date)
    {
        if(!AttendanceEntryAuthentication.authenticateDate(date))return entryList.size();
            date=AttendanceEntryAuthentication.indentDate(date);
        int i=0;
        for(;i<entryList.size();i++)
        {
            if(entryList.get(i).date.equals(date))
            {
                return i;
            }
        }
        return i;
    }
    
    AttendanceEntry getEntry(int i)
    {
        return entryList.get(i);
    }
    
    public Boolean addEntry(String date,char status)
    {
        if(AttendanceEntryAuthentication.authenticateDate(date) && AttendanceEntryAuthentication.authenticateStatus(status))
        {
            date = AttendanceEntryAuthentication.indentDate(date);
//            /System.out.println(date+" "+status);
            if(searchEntry(date)==this.entryList.size() || this.entryList.isEmpty() )
            {
                entryList.add(new AttendanceEntry(date,status));
                return true;
            }
            return false;
        }
        else
            return false;
    }
    
    public Boolean deleteEntry(String date)
    {
        if(!AttendanceEntryAuthentication.authenticateDate(date))return false;
        date=AttendanceEntryAuthentication.indentDate(date);
        int i = searchEntry(date);
        if(i<entryList.size())
        {
            entryList.remove(i);
            return true;
        }
        else
            return false;
    }
    
    public Boolean updateEntryDate(String date)
    {
        if(!AttendanceEntryAuthentication.authenticateDate(date))return false;
        date=AttendanceEntryAuthentication.indentDate(date);
        if(!AttendanceEntryAuthentication.authenticateDate(date))
            return false;
        int i = searchEntry(date);
        if(i<entryList.size())
        {
            entryList.get(i).date=date;
            return true;
        }
        else
            return false;
    }
    
    public Boolean updateEntryStatus(String date,char status)
    {
        if(!AttendanceEntryAuthentication.authenticateDate(date))return false;
        date=AttendanceEntryAuthentication.indentDate(date);
        if(!AttendanceEntryAuthentication.authenticateStatus(status))
            return false;
        int i = searchEntry(date);
        if(i<entryList.size())
        {
            entryList.get(i).status=status;
            return true;
        }
        else
            return false;        
    }
    
    public void display()
    {
        for(int i=0;i<entryList.size();i++)
        {
            System.out.println(entryList.get(i).date +" "+entryList.get(i).status);
        }
    }
    
    public static void main(String[] args) {
        Attendance a = new Attendance();
        a.addEntry("2021-12-02", 'P');
        a.addEntry("2021-12-2", 'P');
        a.addEntry("2021-12-3", 'A');
        a.addEntry("2021-12-4", 'P');
        a.addEntry("2021-12-5", 'P');
        a.addEntry("2021-12-31", 'P');
        a.addEntry("2021-22-02", 'P');
        a.deleteEntry("2021-12-02");
        a.display();
    }
    
}
