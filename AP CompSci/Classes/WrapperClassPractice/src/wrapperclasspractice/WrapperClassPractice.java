/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasspractice;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class WrapperClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Class1 a = new Class1();
        
        System.out.println(a.getX());
        
        Class1 b = new Class1(4);
        
        System.out.println(a.getX() + " " + b.getX());
    
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your password");
        
        String s = c.nextLine();
        boolean bool = Pass(s);
        
        if(bool){
            System.out.println("Accepted");
        } else {
            System.out.println("Denied");
        }
        
    } 
    
    public static boolean Pass(String s){
        boolean b = true;
        //char [] c = s.toCharArray();
 
        Character [] c = new Character[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            c[i] = (char)(s.charAt(i));
        }
        
        //length between 6 and 12
        if(s.length() < 6 || s.length() > 12){
            b = false;
        }
        
        //how many digits
        int i = 0;
        for(Character x: c){
            if(Character.isDigit(x)){
                i++;
            }
        }
        if(i < 2){
            b = false;
        }
        
        i = 0;
        for(Character x: c){
            if(Character.isUpperCase(x)){
                i++;
            }
        }
        if(i < 1){
            b = false;
        }
            
      return b;  
        
    }
}
