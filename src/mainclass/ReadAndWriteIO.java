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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

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
        
        ZipFile zipFile = new ZipFile("zipinput.zip");
        Enumeration e = zipFile.entries();
        ZipEntry zipEntry = (ZipEntry) e.nextElement();
        InputStream stream = zipFile.getInputStream(zipEntry);
        
        
        
        BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        BufferedWriter out = new BufferedWriter (new FileWriter(outputFileName));
        
        
        
        String s = null;
        
        s = convertStreamToString(stream);
        System.out.println(s);
        
//        while(true){
//            if((s = in.readLine()) == null){
//                break;
//            }
//            
//            System.out.println(s);
//            
//        }
        
        stream.close();
        zipFile.close();
        out.close();
        in.close();
    }
    
    static String convertStreamToString(java.io.InputStream stream){
            java.util.Scanner s = new java.util.Scanner(stream).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
    }
    
    
}
