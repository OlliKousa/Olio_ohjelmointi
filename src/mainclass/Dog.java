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

    
    
    
    public Dog(String input1, String input2) {
        
        if(!input1.trim().isEmpty()){
            name = input1;
        }
        
        if (!input2.trim().isEmpty()){
            dogeword = input2;
        }
        
        System.out.print(dogeword + ": ");
        System.out.println(name);
        
    }

     
    public void speak(String input3){
        
        String temp;
        
        Scanner in = new Scanner(input3);
        
        while(in.hasNext()){
            if(in.hasNextBoolean()){
                temp = in.next();
                System.out.println("Se oli boolean:" + temp + ".");

            }else if(in.hasNextInt()){
                temp = in.next();
                System.out.println("Se oli intti." + temp + ".");

            }else if(in.hasNext()){
                temp = in.next();
                System.out.println("Jotain siellä on, mutta intti tai boolean se ei ollut:" + temp + ".");
            } else {
                System.out.println("Tyhjää täynnä.");
            }
        }
        
        
        
        
    }
}
