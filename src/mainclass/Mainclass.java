/*
* Olli Kousa
* 0438471
*/


package mainclass;

import java.util.Scanner;



/**
 *
 * @author Kousa
 */
public class Mainclass {


    public static void main(String[] args) {
    
        BottleDispenser bd = new BottleDispenser();
    
        Scanner scan = new Scanner(System.in);
        
        int choice; 
        
        while(true){
            System.out.println("\n*** LIMSA-AUTOMAATTI ***\n" +
                                "1) Lisää rahaa koneeseen\n" +
                                "2) Osta pullo\n" +
                                "3) Ota rahat ulos\n" +
                                "4) Listaa koneessa olevat pullot\n" +
                                "0) Lopeta");
            System.out.print("Valintasi: ");
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.buyBottle();
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.listBottles();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Valitsit väärin");
                    break;
            }
        }
        
        
        
        
        
        
    }
    
}
