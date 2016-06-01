/*
 * Olli Kousa
 * 0438471
 * 1.6.2016
 */
package mainclass;

/** 
 *
 * @author Kousa
 */
public class Bottle {
    
    private String name;
    private String manufacturer;
    private double total_energy;
    private double bottle_size;
    private double bottle_cost;
    
    
    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        bottle_size = 0.5;
        bottle_cost = 1.8;
    }
    
    public Bottle(String name1, String manuf, double totE, double size, double cost){
        name = name1;
        manufacturer = manuf;
        total_energy = totE; 
        bottle_size = size;
        bottle_cost = cost; 
    }
    
    public String getName(){
        return name;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public double getEnergy(){
        return total_energy;
    }
    
    public double getSize(){
        return bottle_size;
    }
    
    public double getCost(){
        return bottle_cost;
    }
    
}
