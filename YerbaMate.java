/**@author Noah Marino**/
public class YerbaMate extends Tea {
    //CONSTANT VARIABLES
    public static final int DEFAULT_NUM_PASSES = 0;

//INSTANCE VARIABLES
    private int numPasses;

//CONSTRUCTORS
    /*Full constructor that also handles error and shuts down if invalid data is given
     * @param name -> name of the beverage
     * @param ounces -> number of fluid ounces in the beverage container (not the container capacity)
     * @param price -> cost of the beverage
     * @param brewTemp -> temperature tea is brewed at (in Celsius)
     * @param numPasses -> number of passes between people that have shared a drink from the gourd container.
    */
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        if (!this.setNumPasses(numPasses)) {
            System.out.println("ERROR: Bad data given to full Tea constructor");
            System.exit(0);
        }
    }

    //Default constructor that sets the default name/ounces/price/brew temperature along with the number of passes of the gourd.
    public YerbaMate() {
        super();
        this.setBrewTemp(DEFAULT_NUM_PASSES);
    }

    //Overloaded constructor that handles errors when invalid data is input and then defaults.
    /*numPasses defaults to 0
     * @param name -> name of the beverage
     * @param ounces -> number of fluid ounces in the beverage container (not the container capacity)
     * @param price -> cost of the beverage
     * @param brewTemp -> temperature tea is brewed at (in Celsius)
     * @param numPasses -> number of passes between people that have shared a drink from the gourd container.
    */
    public YerbaMate(String name, int ounces, double price, int brewTemp) {
        this(name, ounces, price, brewTemp, DEFAULT_NUM_PASSES);
    }
    
    //Copy constructor that creates a deep copy of all the *valid* instance variables
    public YerbaMate(YerbaMate original) {
        if (original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.getBrewTemp(),
                    original.numPasses);
        } else {
            System.out.println("ERROR: null data given to copy YerbaMate constructor.");
            System.exit(0);
        }
    }

//SETTERS/MUTATORS
        /*Sets the number of passes for the object with error checking
         * @param numPasses -> number of passes between people that have drank from the gourd container.
         * @return boolean true if valid (if the passes is above or equal to 0), and false otherwise.
        */
    public boolean setNumPasses(int numPasses) {
        if (numPasses >= 0) {
            this.numPasses = numPasses;
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
        * @param numPasses -> number of passses between people that have drank from the gourd.

        * @return true if all four paramaeters are valid, false if not.
    */
    public boolean setAll(String name, int ounces, double price, int brewTemp, int numPasses) {
        return super.setAll(name, ounces, price, brewTemp) && this.setNumPasses(numPasses);
    }
    
//GETTERS/ACCESSORS
        /*Gets the number of passes of the gourd.
         * @return ther number of passes of the gourd.
        */
        public int getNumPasses() {
            return this.numPasses;
        }
    
//EQUALS method
@Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()){
        return false;
        }
        YerbaMate otherMate = (YerbaMate) other;
        return super.equals(otherMate) && this.numPasses == otherMate.numPasses;
}
    
//toString method
/*Adds on to the CaffeinatedBeverage toString with regards to adding the tea and brewtemp */
    @Override
    public String toString() {
        String teaString = super.toString();
        int colonLocation = teaString.indexOf(":");
        teaString = teaString.substring(colonLocation + 2);
        
        return String.format("YerbaMate: %s, %d passes so far", teaString, this.numPasses);
    }
}

