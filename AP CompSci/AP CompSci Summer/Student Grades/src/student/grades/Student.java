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
    String name;
    double [] grade;
    static int numStuds = 25;
    static String [] allN = new String[numStuds];
    static double [] allA = new double[numStuds];
    
    public Student(){
    }
    
    public Student(String n, double [] g, int i){
        name = n;
        grade = g;  
        allN[i] = name;
        allA[i] = formA(grade, i);
        
        
    }
    
    public static double formA(double [] grades, int i){ // formA = form Averages
        int c = 0;
        double t = 0;
        for(double x : grades){
            t += x;
            c++;
        } 
        return t / c;
    }
    
    public static double getA(int i){
        return allA[i];
    }
    
    public static String getN(int i){
        return allN[i];
    }
}
