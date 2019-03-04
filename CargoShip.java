/**
 *
 * @author Ngan
 */
public class CargoShip extends Ship{
    
    //A Cargoship's constructor that calls superclass Ship's constructor
    public CargoShip(String name, String yearBuild) {
        super(name, yearBuild);
    }
    
    //An int field that holds the number of Tonnage
    public int numTonnage;
    
    //Overloaded Contructor that accept the cargoship's name and its cargo capacity
    public CargoShip(String cargoName, int t)
    {
        super.name = cargoName;
        numTonnage = t;
    }
    
    //Accessor
    public int getNumTonnage(int numTonnage)
    {
        this.numTonnage = numTonnage;
        return this.numTonnage;
    }
    
    
    /**Override toString method in superclass Ship
     * This toString method should returns 
     * cargo ship's name and its cargo capacity
    */ 
    public String toString()
    {
        String cargoShipStr = "The Cargo ship's name is " + name 
                            + ", and its cargo capacity is " + numTonnage + ".";
        return cargoShipStr;
    }    
}
