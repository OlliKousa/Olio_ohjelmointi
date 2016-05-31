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
    
        BottleDispenser bd = new BottleDispenser();
    
        for(int i = 0 ; i < 1 ; i++)
            bd.addMoney();
        
        for(int i = 0 ; i < 7 ; i++)
            bd.buyBottle();
        
        bd.returnMoney();
        
        System.out.println("Kiittimoi.");
        
        
    }
    
}
