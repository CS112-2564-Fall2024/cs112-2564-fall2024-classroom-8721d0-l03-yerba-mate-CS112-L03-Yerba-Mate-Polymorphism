/**@author Noah Marino**/
public class Tea extends CaffeinatedBeverage {
//CONSTANT VARIABLES
    public static final int DEFAULT_BREW_TEMP = 90;

//INSTANCE VARIABLES
    private int brewTemp;

//CONSTRUCTORS
    /*Full constructor that also handles error and shuts down if invalid data is given
     * @param name -> name of the beverage
     * @param ounces -> number of fluid ounces in the beverage container (not the container capacity)
     * @param price -> cost of the beverage
     * @param brewTemp -> temperature tea is brewed at (in Celsius)
    */
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        if (!this.setBrewTemp(brewTemp)) {
            System.out.println("ERROR: Bad data given to full Tea constructor");
            System.exit(0);
        }
    }

    //Default constructor that sets the default name/ounces/price along with brew temperature to the pre-determined 90 degrees until otherwise changed.
    public Tea() {
        super();
        this.setBrewTemp(DEFAULT_BREW_TEMP);
    }

//SETTERS/MUTATORS
        /*Sets the brew temperature for the object with error checking
         * @param brewTemp -> temperature tea is brewed at (in Celcsius)
         * @return boolean true if valid (if the temperature is above 0 degrees), and false otherwise.
        */
    public boolean setBrewTemp(int brewTemp) {
        if (brewTemp > 0) {
            this.brewTemp = brewTemp;
            return true;
        } else {
            return false;
        }
    }
        
    /*Sets all *valid* instance variables
        * @param name -> name of the beverage.
        * @param ounces -> fluid ounces of the beverage, not the container.
        * @param price -> cost of the beverage.
        * @param brewTemp -> temperature at which the beverage is brewed at (in Celsius)
        * 
        * @return true if all four paramaeters are valid, false if not.
    */
    public boolean setAll(String name, int ounces, double price, int brewTemp) {
        return super.setAll(name, ounces, price) && this.setBrewTemp(brewTemp);
    }
    
//GETTERS/ACCESSORS
        /*Gets brew temperature (in celsius)
         * @return temperature tea was brewed at (in celsius)
        */
        public int getBrewTemp() {
            return this.brewTemp;
        }
    
//EQUALS method
    public boolean equals(Object other) {
        if (other == null || other instanceof Tea) {
        return false;
        }
        Tea otherTea = (Tea) other;
        return super.equals(otherTea) && this.brewTemp == otherTea.brewTemp;
}
    
//toString method
/*Adds on to the CaffeinatedBeverage toString with regards to adding the tea and brewtemp */
    @Override
    public String toString() {
        String caffeineString = super.toString();
        int colonLocation = caffeineString.indexOf(":");
        caffeineString = caffeineString.substring(colonLocation + 2);
        
        return String.format("Tea: %s, brewed @ %d°C", caffeineString, this.brewTemp);
    }
}
