/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kousa
 */
public class ReadAndWriteIO {
    
    private String filename = "input.txt";
    
    public ReadAndWriteIO (String s){
        filename = s;
    }
    
    public void readText() throws IOException{
        BufferedReader in = new BufferedReader (new FileReader (filename));
        String s = null;
        
        while(true){
            ;
            if((s = in.readLine()) == null){
                break;
            }
            System.out.println(s);
        }
        
        in.close();
    }
}
