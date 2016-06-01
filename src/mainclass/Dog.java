/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author Kousa
 */
public class Dog {
    String name = "Doge";
    String dogeword = "Much wow!";

    
    
    
    public Dog(String input1) {
        
        if(!input1.trim().isEmpty()){
            name = input1;
        }
        
        
        
        System.out.println("Hei, nimeni on " + name);
        
    }

     
    public void speak(String input2){
        
        if (!input2.trim().isEmpty()){
            dogeword = input2;
        }
        
        String temp;
        
        Scanner in = new Scanner(dogeword);
        
        while(in.hasNext()){
            if(in.hasNextBoolean()){
                temp = in.next();
                System.out.println("Such boolean: " + temp);

            }else if(in.hasNextInt()){
                temp = in.next();
                System.out.println("Such integer: " + temp);

            }else if(in.hasNext()){
                temp = in.next();
                System.out.println(temp);
            } else {
                System.out.println("Tyhjää täynnä.");
            }
        }
        
        
        
        
    }
}