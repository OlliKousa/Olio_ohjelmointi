/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kousa
 */
public class BottleDispenser {

    private double money;
    private ArrayList<Bottle> bottleList = new ArrayList<Bottle>();

    public BottleDispenser() {

        money = 0;
        
        Bottle newBottle1 = new Bottle("Pepsi Max", "Pepsi", 0, 0.5, 1.8);
        for (int i = 0 ; i < 1 ; i++){
            bottleList.add(newBottle1);
        }
        
        Bottle newBottle2 = new Bottle("Pepsi Max", "Pepsi", 0, 1.5, 2.2);
        for (int i = 0 ; i < 1 ; i++){
            bottleList.add(newBottle2);
        }   
        
        Bottle newBottle3 = new Bottle("Coca-Cola Zero", "Cocacola Company", 0, 0.5, 2.0);
        for (int i = 0 ; i < 1 ; i++){
            bottleList.add(newBottle3);
        }
        
        Bottle newBottle4 = new Bottle("Coca-Cola Zero", "Hartwall", 0, 1.5, 2.5);
        for (int i = 0 ; i < 1 ; i++){
            bottleList.add(newBottle4);
        }
        
        Bottle newBottle5 = new Bottle("Fanta Zero", "Hartwall", 0, 0.5, 1.95);
        for (int i = 0 ; i < 2 ; i++){
            bottleList.add(newBottle5);
        }
                
        
        
    }
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Lisää rahaa laitteeseen!");
    }

    public void buyBottle() {
        
        listBottles();
        
        System.out.print("Valintasi: ");
        Scanner scan = new Scanner(System.in);
       
        int choice;
        choice = scan.nextInt();
        choice -= 1; 
        
        
        if ((bottleList.size() > 0) && (money > bottleList.get(choice).getCost())){
            
            
            System.out.println("KACHUNK! " + bottleList.get(choice).getName() + " tipahti masiinasta!");
            
            money -= bottleList.get(choice).getCost();
            
            // Poistetaan viimeinen objekti listasta. (Indeksit kusee, siksi vähentäminen ennen poistamista) 
            bottleList.remove(choice);            
             
            
            
        }else{
            System.out.println("Syötä rahaa ensin!");
        }
    }

    public void returnMoney() {
        
        System.out.format("Klink klink. Sinne menivät rahat! Rahaa tuli ulos %.2f€\n", money);
        money = 0;
    }
    

    public void listBottles() {
        for (int i = 0 ; i < bottleList.size() ; i++){
            System.out.print((i+1) + ". Nimi: ");
            System.out.println(bottleList.get(i).getName());
            System.out.print("\tKoko: " + bottleList.get(i).getSize());
            System.out.println("\tHinta: " + bottleList.get(i).getCost());
        }
    }
}
