/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kousa
 */
public class ReadAndWriteIO {
    
    private String inputFileName = "input.txt";
    private String outputFileName = "output.txt";
    
    public ReadAndWriteIO (){
//        inputFileName = s;
    }
    
    public void readAndWrite(String input, String output) throws FileNotFoundException, IOException{
        inputFileName = input;
        outputFileName = output;
        
        BufferedReader in = new BufferedReader (new FileReader (inputFileName));
        BufferedWriter out = new BufferedWriter (new FileWriter(outputFileName));
        String s = null;
        while(true){
            if((s = in.readLine()) == null){
                break;
            }
            
            System.out.println(s);
            
            if (s.length() < 30 && s.trim().length() != 0 && s.contains("v")) {
                out.write(s);
                out.write("\n");
            }
        }
        out.close();
        in.close(); 
        
        
        
        
        
        
        
        
    }
    
    
}
