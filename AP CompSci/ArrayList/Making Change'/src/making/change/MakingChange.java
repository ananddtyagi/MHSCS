/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making.change;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class MakingChange {

    /**
     * @param args the command line arguments
     */
    
    static public int c = 0, in = 0;
    
    public static void main(String[] args) {
       

            Scanner a = new Scanner(System.in);
            in = a.nextInt();
            int q, d, n, p;
            q = in / 25;
            d = (in - 25*q)/10;
            n = (in - 25*q - 10*d)/5;   
            Cents(in, q, d, n);
            System.out.println(c);
            
        
    }
        
    static public int Cents(int t, int q, int d, int n) {
        
        System.out.println(q + " " + d + " " + n);
        if(q > 0){
            if(d > 0){
                if(n > 0){
                    n--;
                } else if(n == 0){
                    d--;
                    n = (t - 25*q - 10*d) / 5;
                }
            } else if(d == 0){
                if(n > 0){
                    n--;
                } else if(n == 0){
                    q--;
                    d = (t-25*q)/10;
                    n = (t-25*q-10*d)/5;
                }
            }
        } else if (q == 0) {
            if(d > 0){
                if(n > 0){
                    n--;
                } else if (n == 0){
                    d--;
                    n = (t-10*d)/5;
                }
            } else if (d == 0){
                if(n > 0){
                    n--;
                } else if (n == 0){
                   c++;
                }
            }
        }
         
        c++;
        if(q == 0 && d == 0 && n == 0){
            c++;
            return c;
        } else {           
          
            return Cents(t, q, d, n);
           
        }
        
        
    
    }
}



/* best attempt so far


       if(q > 0){
           if(d > 0){
               if(n > 0){
                   n--;
               } else {
                   d--;
               }
           } else if(d == 0){
               if(n > 0){
               n --;
               }
           } else {
               q--;
           }
       } else if(q == 0){
           d = t / 10;
           n = (t-10*d) / 5;
           q = -1;
       }
       
     
        if(q < 0 && d > 0){
            if(n > 0){
                n--;
          
            } else {
                d--;
                n = (t-10*d)/5;
            }                
        } else if(d == 0){
            n = t/5;
            d = -1;
        }   
        
     
        if(q < 0 && d < 0){
            if(n > 0){
            n--;
             } else if (n==0){
                 n = -1;
             }
        } 
*/


      /*

        if(q > 0){
            q -= qc;
            qc++;
            d = (in - 25*q)/10;
        } else {
            q = 0;
            d = t/10;
            n = (t - 5*d)/5;
            dc = 0;
            nc = 0;
        }
        
        if(d > 0){
            d -= dc;
            dc++;
            n = (in - 25*q - 10*d)/5;
        } else if(d == 0 && q == 0){
            d = 0;
            n = t/5;     
            nc = 0;
        }
        
        if(n > 0 ){
            n -= nc;
            nc--;
        }
        c++;
        
  
        if(q == 0 && d == 0 && n == 0){
            return c;
        } else {
            return Cents(t, q, d, n, qc, dc, nc);
        }
        
        
        
       
        
            
    }

    /*
    static public void Quarters(int t){
        int numQ = t / 25;
        while(numQ >= 0){
            Dimes(t - (numQ * 25));
            numQ--;
        }
    }
    
    static public void Dimes(int t){
        int numD = t / 10;
        while(numD >= 0){
            Nickels(t - (numD * 5));
            numD--;
        }
    }
    
    static public void Nickels(int t){
        int numN = t / 5;
        while(numN >= 0){
            Pennies(t - (numN * 5));
            numN--;
        }
    }
    
    static public void Pennies(int t){
        int numP = t;
        c++;   
    }
    */
