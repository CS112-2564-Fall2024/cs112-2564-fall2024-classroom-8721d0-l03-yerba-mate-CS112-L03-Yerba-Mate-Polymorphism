/**@author Noah Marino**/
public class CaffeinatedBeverage
{
    //CONSTANT VARIABLES
    private static final String DEFAULT_NAME = "Caffeinated Beverage";
    private static final int DEFAULT_OUNCES = 16;
    private static final double DEFAULT_PRICE = 2.00;

    //INSTANCE VARIABLES
    private String name;
    private int ounces;
    private double price;

     //CONSTRUCTORS
    public CaffeinatedBeverage(String name, int ounces, double price) {
         //FULL CONSTRUCTOR THAT EXITS SYSTEM IF BAD DATA IS GIVEN.
         /*
         //@param name -> beverage name.
         //@param ounces -> number of fluid ounces in the beverage.
         //@param price -> price of the entire beverage.
         */
            if (!this.setAll(name, ounces, price)) {
                System.out.println("ERROR: Bad data given to full CaffeinatedBeverage constructor.");
                System.exit(0);
            }
        }
        //DEFAULT CONSTRUCTOR THAT SETS THE VARIABLES TO OUR DEFAULT (PRE-DETERMINED) DATA
        /*
         * DEFAULT_NAME -> the default variable for the beverage name which is set at "Caffeinated Beverage"
         * DEFAULT_OUNCES -> the default variable for the fluid ounces of the drink which is set at "16"
         * DEFAULT_PRICE -> the default price given for the beverage which is set at "2.00"
         */
    public CaffeinatedBeverage() {
        this(DEFAULT_NAME, DEFAULT_OUNCES, DEFAULT_PRICE);
        }
        
        //COPY CONSTRUCTOR THAT CREATES A DEEP COPY OF ALL INSTANCE VARIABLES
    public CaffeinatedBeverage(CaffeinatedBeverage original) {
        if (original != null) {
            this.setAll(original.name, original.ounces, original.price);
        } else {
            System.out.println("ERROR: null data given to copy CaffeinatedBeverage constructor.");
            System.exit(0);
        }
    }

    //SETTERS
        /* 
        //Sets name for object returning true or false if it is within reasonable parameters.
        //@param name of the beverage
        */ /* 
        //@return boolean true if a valid String (not empty or null), otherwise returns boolean false
         */
        public boolean setName(String name) {
            if(name != null && name.length() > 0) {
                this.name = name;
                return true;
            } else {
                return false;
            }
    }
        //Sets the number of liquid ounces of the beverage while checking it is a valid number (> or = 0)
        //@param number of liquid ounces in the beverage
        //@return boolean true if the number of liquid ounces is great to or equal to 0, and false if less than 0.
    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        } else {
            return false;
        }
    }

        //Sets the price of the beverage while checking it is a valid price (> or = 0)
        //@param price of the beverage in dollars.
        //@return boolean true if a valid price (0 dollars or more) and false if less than 0 dollars.
    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
            } else {
                return false;
            }
        }
    
        //Sets all *valid* insance variables.
        //@param name of the beverage.
        //@param liquid ounces the beverage contains.
        //@param price of the beverage.
        //@return boolean true if all three parameters are valid.
        public boolean setAll(String name, int ounces, double price) {
            return this.setName(name) && this.setOunces(ounces) && this.setPrice(price);
        }
    
     //GETTERS
        //Gets the name of the beverage
        //@return name of the beverage
    public String getName() {
        return this.name;
    }
        //Gets the number of fluid ounces in the beverage
        //@return number of ounces in the beverage (not capacity of the container)
    public int getOunces() {
        return this.ounces;
    }
        //Gets the cost of the beverage.
        //@return cost of the beverage
    public double getPrice() {
        return this.price;
    }

        //Cleaned up version of the given equals method
    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof CaffeinatedBeverage) {
            return false;
        }
        CaffeinatedBeverage otherCaffeine = (CaffeinatedBeverage) other;
        return this.ounces == otherCaffeine.ounces &&
                Double.compare(this.price, otherCaffeine.price) == 0 &&
                this.name.equals(otherCaffeine.name);
    }
    
    @Override
    public String toString() {
        return String.format("CaffeinatedBeverage: name = %s, %d fl. oz., $%.2f", this.name, this.ounces, this.price);
    }
    
        //Simulates taking a sip of the beverage, returns boolean if there is more liquid left in the container.
        /*
        * @oaram ounces sip size in fluid ounces
        * @return boolean true if ounces left in the container is greater than 0. Returns false if container is empty.
        */
    public boolean sip(int ounces) {
        if (this.ounces >= ounces) {
            this.ounces -= ounces;
        } else {
            this.ounces = 0;
        }
        return this.ounces > 0;
    }
        
    //Checks if the container has no more liquid/beverage left.
    /*
     * @return true if 0 ounces is left in the container, false if there is more liquid left.
     */
    public boolean isEmpty() {
        return this.ounces == 0;
    }
}