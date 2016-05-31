/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

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

     
//    public void speak(String input2){
//        dogeword = input2;
//        
//    }
}
