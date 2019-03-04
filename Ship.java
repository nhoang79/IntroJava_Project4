/**
 * #10: Ship class
 * @author Ngan
 */
public class Ship {
    
    //A String field to hold name of the ship
    public String name;
    //A String field to hold the year the ship was built
    public String yearBuild;
    

    //Constructor that accept ship's name and its made year
    public Ship (String name, String yearBuild)
    {
        this.name = name;
        this.yearBuild = yearBuild;
    }
    
    //No-arg Constructor
    public Ship()
    {
        
    }
    
    
    //Accesor
    public String getName(String n)
    {
        name = n;
        return name;
    }
    
    public String getYearBuild(String b)
    {
        yearBuild = b;
        return yearBuild;
    }
    
    public String toString()
    {
        String str = "The Ship's name is " + name + ", and the year that it was made"
                    + " is " + yearBuild + ".";
        return str;
    }
    
    
    
}
