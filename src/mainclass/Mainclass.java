/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kousa
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = null;
        String hellowords = null;
        String testword = null;
        
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//        System.out.print("Anna koiran nimi: ");
//        try {
//            name = br.readLine();
//        } catch (IOException ex) {
//            Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                
//        System.out.print("Anna koiralle lausahdus: ");
//        try {
//            hellowords = br.readLine();
//        } catch (IOException ex) {
//            Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        Dog d1 = new Dog("Kalle", "Moikkuli");
        
        System.out.print("Anna koiralle lelu: ");
        try {
            testword = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        d1.speak(testword);
        
        
    }
    
}
