/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ngan
 */
public class Cruiseship extends Ship {
    
    //field of cruiseship that hold maximum number of passengers on Cruiseship
    public int maxNumPassengers;

    //A Cruiseship's constructor that call the superclass Ship's contructor
    public Cruiseship(String name, String yearBuild) {
        super(name, yearBuild);
    }
    
    //Overloaded Constructor that accept Cruiseship's name 
    //and its max number of passengers
    public Cruiseship(String cruiseshipName, int max)
    {
        super.name = cruiseshipName; 
        maxNumPassengers = max;
    }
    
    //Accesor
    public int getMaxPassenger(int max)
    {
        maxNumPassengers = max;
        return maxNumPassengers;
    }
    
    //toString method that overrides toString method in superclass Ship
    public String toString()
    {
        String strCruiseship = "The Cruiseship's name is " + name + ", and "
                                + "its maximum numbers of passengers is " 
                                + maxNumPassengers + ".";
        return strCruiseship;
    }
}
