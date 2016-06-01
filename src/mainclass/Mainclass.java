/*
 * Olli Kousa
 * 0438471
 * 1.6.2016
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

    
    public static void main(String[] args) throws IOException {
        
        String filename = "input.txt";
        System.out.println(System.getProperty("user.dir"));
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        ReadAndWriteIO ioop = new ReadAndWriteIO(filename);
        
        
        ioop.readText();
        
    }
    
}