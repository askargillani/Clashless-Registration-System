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
public class Evaluations {
    ArrayList<EvaluationEntry> evalList;
    
    public Evaluations()
    {
        evalList = new ArrayList<>();
    }
    
    public int searchEvaluation(String evalName)
    {
        int i=0;
        for(;i<evalList.size();i++)
        {
            if(evalList.get(i).evaluationName.equals(evalName))
            {
                return i;
            }
        }
        return i;
    }
    
    public boolean addEvaluation(String evalName,double marks)
    {
        if(searchEvaluation(evalName)==evalList.size() || evalList.isEmpty())
        {
            evalList.add(new EvaluationEntry(evalName,marks));
            return true;
        }
        return false;
    }
    
    public Boolean removeEvaluation(String evalName)
    {
        int i = searchEvaluation(evalName);
        if(i!=evalList.size())
        {
            evalList.remove(i);
            return true;
        }
        return false;
    }
    
    public Boolean updateEvaluation(String evalName)
    {
        int i = searchEvaluation(evalName);
        if(i!=evalList.size())
        {
            evalList.get(i).evaluationName=evalName;
            return true;
        }
        return false;
    }
    
    public Boolean updateEvaluation(String evalName,double marks)
    {
        int i = searchEvaluation(evalName);
        if(i!=evalList.size())
        {
            evalList.get(i).marks=marks;
            return true;
        }
        return false;        
    }
    
    public void display()
    {
        for(int i=0;i<evalList.size();i++)
        {
            System.out.println(evalList.get(i).evaluationName + " : " + evalList.get(i).marks);
        }
    }
    
    int noOfEvaluations()
    {return evalList.size();}
    
    EvaluationEntry getEvaluation(int i)
    {
        return evalList.get(i);
    }
    
    public static void main(String[] args) {
        Evaluations e=new Evaluations();
        e.addEvaluation("Quiz 1",12.65);
        e.addEvaluation("Quiz 2",12.65);
        e.addEvaluation("Quiz 2",12.65);
        e.updateEvaluation("Quiz 2",11.32);
        e.display();
    }
}
