public class CaffeinatedBeverage {
    // constant variables
    public static final String DEFAULT_NAME = "Caffeine Fix";
    public static final int DEFAULT_OUNCES = 16;
    public static final double DEFAULT_PRICE = 0.99;

    private String name;
    private int ounces;
    private double price;


    public CaffeinatedBeverage(String name, int ounces, double price) {
        if (!this.setAll(name, ounces, price)) {
            System.out.println("ERROR: Bad data given to full CaffeinatedBeverage constructor");
            System.exit(0);
        }
    }

    /*
     * DEFAULT CONSTRUCTOR
     */
    public CaffeinatedBeverage() {
        this(DEFAULT_NAME, DEFAULT_OUNCES, DEFAULT_PRICE);
    }

    /*
     * copy constructor
     */
    public CaffeinatedBeverage(CaffeinatedBeverage original) {
        if (original != null) {
            this.setAll(original.name, original.ounces, original.price);
        } else {
            System.out.println("ERROR: null data given to copy CaffeinatedBeverage constructor. ");
            System.exit(0);
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public int getOunces() {
        return this.ounces;
    }

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int ounces, double price) {
        return this.setName(name) && this.setOunces(ounces) && this.setPrice(price);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof CaffeinatedBeverage)
            return false;
        CaffeinatedBeverage otherCaffeine = (CaffeinatedBeverage) other;
        return this.ounces == otherCaffeine.ounces &&
                Double.compare(this.price, otherCaffeine.price) == 0 &&
                this.name.equals(otherCaffeine.name);
    }

    public String toString() {
        return String.format("CaffeinatedBeverage: name = %s, %d fl. oz., $%.2f", this.name, this.ounces, this.price);
    }

    public boolean sip(int ounces) {
        if (this.ounces >= ounces) {
            this.ounces -= ounces;
        } else {
            this.ounces = 0;
        }
        return this.ounces > 0;
    }

    public boolean isEmpty() {
        return this.ounces == 0; 
    }
}