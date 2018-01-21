/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grades;

/**
 *
 * @author AnandTyagi
 */
public class Student {
    String Fname, Lname, SSN;
    int [] grades;
    int avg;
    Student(){
        Fname = "";
        Lname = "";
        SSN = "";
        grades = new int[3];
        grades[0] = 0;
        grades[1] = 0;
        grades[2] = 0;
        avg = 0;
                
    }
   
    Student(String F, String L, String S, int [] g){
        Fname = F;
        Lname = L;
        SSN = S;
        grades = g;
        avg = avg(g);
    }
    
    int avg(int [] g){
        return (g[0] + g[1] + g[2]) / 3;
    }
    
    Student [] gradeSort(Student [] s){
        Student [] sOrder = new Student[3];
        if(s[0].avg > s[1].avg){
            if(s[0].avg > s[2].avg){
                sOrder[0] = s[0];
            }
            else{
                sOrder[1] = s[0];
            }
            
        } else {
            sOrder[2] = s[0];
        }
        
        if(s[1].avg > s[0].avg){
            if(s[1].avg > s[2].avg){
                sOrder[0] = s[0];
            }
            else{
                sOrder[1] = s[1];
            }
            
        } else {
            sOrder[2] = s[2];
        }
        
        if(s[2].avg > s[0].avg){
            if(s[0].avg > s[1].avg){
                sOrder[0] = s[2];
            }
            else{
                sOrder[1] = s[2];
            }
            
        } else {
            sOrder[2] = s[2];
        }
        
        return s;
        
    }
}
