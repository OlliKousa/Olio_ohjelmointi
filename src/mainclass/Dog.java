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
    String nimi;
    String lausahdus;
    
    
    public Dog(String input1) {
        nimi = input1;
        System.out.println("Hei, nimeni on " + nimi + "!");
    }
    
    public void speak(String input2){
        lausahdus = input2;
        System.out.println(lausahdus);
    }
}
