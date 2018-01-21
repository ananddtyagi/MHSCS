/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class StudentGrades {

    /**
     * @param args the command line arguments
     */
    

    static boolean ownSort = true;
    static int numStuds = 25;
    public static void main(String[] args) throws FileNotFoundException {
        File i = new File("Grades.txt");
        Scanner info = new Scanner(i);
        info = info.useDelimiter("\n");
    
        Student[] s = new Student[numStuds];
        String line = "", name = "";
       
        double [] grades = new double[5];
        String [] infoS = new String[6]; //infoS = info Split up
        
        double [] avgs = new double[numStuds];
        String [] names = new String[numStuds];
        int numLines;
        
        for(numLines = 0; info.hasNextLine(); numLines++){
            line = info.nextLine();
            infoS = line.split("\\s+");
            name = infoS[0];
            
            for(int x = 0; x < 5; x++){
                grades[x] = Double.parseDouble(infoS[x + 1]);
            }
            
            s[numLines] = new Student(name, grades, numLines);     
            
            avgs[numLines] = s[numLines].getA(numLines);
            names[numLines] = s[numLines].getN(numLines);
        }
        
        sortA(avgs, names, numLines, s);
        
        
    }
    
    public static void sortA(double [] avgs, String []names, int i, Student [] s){
        double swap;
        String nameS; //name Swap
        String [] finalOut = new String[25];
               
        if(ownSort){
            i--;
            for(int c = 0; c < i ; c++){
                for(int d = 0; d < i - c; d++){
                    if(avgs[d] > avgs[d+1]){
                     swap = avgs[d];
                     avgs[d] = avgs[d+1];
                     avgs[d+1] = swap;
                     
                     nameS = names[d];
                     names[d] = names[d+1];
                     names[d+1] = nameS;                    
                    }
                }
            }
            for(int g = 0; g < i + 1; g++){
                System.out.println(names[g] + " " + avgs[g]);
            }
        }else{
            Arrays.sort(avgs);           
            for(int c = 0; c < i; c++){
                for(int d = 0; d < i; d++){
                    if(s[d].getA(d) == avgs[(numStuds - 1) - c]){
                        finalOut[c] = s[d].getN(d) + " " + s[d].getA(d);
                    }
                }
            }
            for(int k = i - 1; k > -1; k--){
                System.out.println(finalOut[k]);
            }
           
        }
        
       
    }
    
    
    
}
