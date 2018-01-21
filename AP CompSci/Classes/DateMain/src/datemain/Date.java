/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemain;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author AnandTyagi
 */
public class Date implements Comparable {
    int day, month, year;
    
    Date(){
        day = 1;
        month = 12;
        year = 2015;
    }
    
    Date(int d, int m, int y){
        if(!(setDay(d) && setMonth(m) && setYear(y))){
           System.out.println("Not a valid date"); 
           throw new IllegalArgumentException(); 
        }
        
        day = d;
        month = m;
        year = y;
     
        
        
   }
    
    public boolean setDay(int d){
        boolean good = false;
        if(d > 0 && d < 31){
             good = true;
        }
       
        return good;
    }
    
    public boolean setMonth(int m){
        boolean good = false;
        if(m > 0 && m < 13){
             good = true;
        }
       
        return good;
    }
     
    public boolean setYear(int y){
        boolean good = false;
        if(y > 0 && y < 2016){
             good = true;
        }
       
        return good;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }

    public String getDOW(Date d){
        GregorianCalendar c = new GregorianCalendar();
        c.set(d.day, d.month, d.year);
        int x = c.get(Calendar.DAY_OF_WEEK);
        String s = "";
        System.out.println(x);
        switch(x){
            case 1: s = "Sunday";
                break;
            case 2: s = "Monday";
                break;
            case 3: s = "Tuesday";
                break;
            case 4: s = "Wednesday";
                break;
            case 5: s = "Thursday";
                break;
            case 6: s = "Friday";
                break;   
            case 7: s = "Saturday";
                break;            
        }
        
        return s;
    } 
    
    public int daysBetween(Date date){
        int db = 0, y, m, d;
        
        y = Math.abs(this.year - date.year);
        if(y == 1){
            m = 12 - Math.abs(this.month - date.month);
            y = 0;
        } else {
            m = Math.abs(this.month - date.month);
        }
        
        if(m == 1){
            d = 30 - Math.abs(this.day - date.day);
            m = 0;
        } else {
            d = Math.abs(this.day - date.day);
        }
          
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
        
        db += y * 365;
        db += m * 30;
        db += d;
        
        return db;   
    }
    
    @Override
    public int compareTo(Object o) {
        int x = 0;
        if(this.getYear() > ((Date)o).getYear()){
            x = 1;
        } else {
            x = -1;
        }
        
        if(x == 0){
            if(this.getMonth() > ((Date)o).getMonth()){
                x = 1;
            } else {
                x = -1;
            }
        }
        
        if(x == 0){
            if(this.getDay() > ((Date)o).getDay()){
                x = 1;
            } else {
                x = -1;
            }
        }
        
        return x;
    }
    
    public String toString(){
        return "This date is " + this.getDOW(this) + ", " + this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
    }
    
            
    }

