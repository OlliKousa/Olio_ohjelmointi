/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass.UML;

import java.util.ArrayList;

/**
 *
 * @author Kousa
 */
public class Car {
    
    Body body = null;
    Chassis chassis = null;
    Engine engine = null;
    Wheel wheel1 = null;
    Wheel wheel2 = null;
    Wheel wheel3 = null;
    Wheel wheel4 = null;
    
    public Car(){
        
        body = new Body();
        chassis = new Chassis();
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        
    }
    
    public class Chassis {
        
        private String partName = "Chassis";
        
        public Chassis(){
            System.out.println("Valmistetaan: " + partName);
        }
    }

    public class Engine {
        
        private String partName = "Engine";
        
        public Engine(){
            System.out.println("Valmistetaan: " + partName);
        }
    }

    public class Wheel {
        
        private String partName = "Wheel";
        
        public Wheel(){
            System.out.println("Valmistetaan: " + partName);
        }
    }

    public class Body {
        
        private String partName = "Body";
        
        public Body(){
            System.out.println("Valmistetaan: " + partName);
        }
    }
    
    public void print(){
        
        System.out.println("Autoon kuuluu:");
        
        System.out.print("\t\t");
        System.out.println(body.partName);
        System.out.print("\t\t");
        System.out.println(chassis.partName);
        System.out.print("\t\t");
        System.out.println(engine.partName);
        System.out.print("\t\t");
        System.out.println(wheel1.partName);
        System.out.print("\t\t");
        System.out.println(wheel2.partName);
        System.out.print("\t\t");
        System.out.println(wheel3.partName);
        System.out.print("\t\t");
        System.out.println(wheel4.partName);        
        
        
    }
    
}




