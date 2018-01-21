/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Enigma {

    /**
     * @param args the command line arguments
     */
    static char[] alphabet;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (i + 97);
        }
        
  
        
        char rotor1[][] = new char[2][26];
        rotor1[0] = alphabet;
        rotor1[1] = alphabet;

        
        char rotor2[][] = new char[2][26];
        rotor2[0] = alphabet;
        rotor2[1] = alphabet;

       
        char rotor3[][] = new char[2][26];
        rotor3[0] = alphabet;
        rotor3[1] = alphabet;

       
        char reflector[][] = new char[2][26];
        reflector[0] = alphabet;
        reflector[1] = alphabet;
        
        
        System.out.println("Please enter encoded message equal to \"Hello, World\" ");
        String s = in.nextLine().toLowerCase();
        System.out.println(DetermineRotorSettings(s, rotor1, rotor2, rotor3, reflector));
        
        /*
        int[] rotorSettings = new int[4];
        System.out.println("Enter rotor settings");
        for (int i = 0; i < 4; i++) {
            rotorSettings[i] = in.nextInt();
        }

        char [] r1 = {'q','a','z','x','s','w','e','d','c','v','f','r','t','g','b','n','h','y','u','j','m','k','i','o','l','p'};        
        
        char rotor1[][] = new char[2][26];
        rotor1[0] = Rotors(r1, rotorSettings[0]);
        rotor1[1] = alphabet;

        char [] r2 = {'a','z','q','w','s','x','e','d','c','r','f','v','t','g','b','y','h','n','u','j','m','i','k','o','l','p'};
        
        char rotor2[][] = new char[2][26];
        rotor2[0] = Rotors(r2, rotorSettings[0]);
        rotor2[1] = alphabet;

        char [] r3 = {'m','k','i','l','o','p','j','u','n','h','y','b','g','t','v','f','r','c','d','e','x','s','w','z','a','q'};
        
        char rotor3[][] = new char[2][26];
        rotor3[0] = Rotors(r3, rotorSettings[0]);
        rotor3[1] = alphabet;

        char [] ref = {'k','i','l','j','u','m','o','p','d','c','f','v','e','r','g','b','t','y','h','n','x','s','w','q','a','z'};
        
        char reflector[][] = new char[2][26];
        reflector[0] = Rotors(ref, rotorSettings[0]);
        reflector[1] = alphabet;
        */
        
        System.out.println("Enter your message");
        in.nextLine();
        String mes = in.nextLine();
        String en = Encrypt(mes, rotor1, rotor2, rotor3, reflector);
        System.out.println("encrypted " + en);
        
        System.out.println("Enter your encrypt");
        mes = in.nextLine();
        String de = Decrypt(mes, rotor1, rotor2, rotor3, reflector);
        System.out.println(de);
        
        
    }
    
    public static int DetermineRotorSettings(String s, char [][] r1, char [][] r2, char [][] r3, char [][] ref){
        
        //takes in a string, keeps running decryption tests on it, when it matches, it returns the individual rotor settings for each rotor 
        boolean done = false;
        int i = 0;
        while(!done){
            r1 [0] = Rotors(r1, i);
            r2 [0] = Rotors(r2, i);
            r3 [0] = Rotors(r3, i);
            ref[0] = Rotors(ref, i);
            
            if(Decrypt(s, r1, r2, r3, ref).equals("hello, world")){
                done = true;
            } else {
                i++;
            }
        }
        
        
        return i;
    }

    public static char[] Rotors(char[][] r, int setting) {
       
        char [] rotor = new char[26];
        //spins rotors
        for(int i = 0 ; i < 26; i++){
            rotor[i] =  r[1][(i - setting  + 26) % 26];
        }
   
        return rotor;
    }

    public static String Encrypt(String s, char[][] rotor1, char[][] rotor2, char[][] rotor3, char[][] reflector) {
        char c = ' ';
        String re = "";
        int k = 0;
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);
            found = false;
            k = 0;
            if ((int) c < 97 || (int) c > 122) {

            } else {

                while (!found) {
                    if (rotor1[0][k] == c) {
                        c = rotor1[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor2[0][k] == c) {
                        c = rotor2[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor3[0][k] == c) {
                        c = rotor3[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (reflector[0][k] == c) {
                        c = reflector[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor3[1][k] == c) {
                        c = rotor3[0][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor2[1][k] == c) {
                        c = rotor2[0][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor1[1][k] == c) {
                        c = rotor1[0][k];
                        found = true;
                    }
                    k++;
                }
            }

            re += Character.toString(c);
        }

        return re;
    }

    public static String Decrypt(String s, char[][] rotor1, char[][] rotor2, char[][] rotor3, char[][] reflector) {
        char c = ' ';
        String de = "";
        int k = 0;
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);
            found = false;
            k = 0;

            if ((int) c < 97 || (int) c > 122) {

            } else {
                while (!found) {
                    if (rotor1[0][k] == c) {
                        c = rotor1[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor2[0][k] == c) {
                        c = rotor2[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor3[0][k] == c) {
                        c = rotor3[1][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (reflector[1][k] == c) {
                        c = reflector[0][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor3[1][k] == c) {
                        c = rotor3[0][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor2[1][k] == c) {
                        c = rotor2[0][k];
                        found = true;
                    }
                    k++;
                }
                k = 0;
                found = false;
                while (!found) {
                    if (rotor1[1][k] == c) {
                        c = rotor1[0][k];
                        found = true;
                    }
                    k++;
                }
            }
            de += Character.toString(c);
        }

        return de;
    }
}
