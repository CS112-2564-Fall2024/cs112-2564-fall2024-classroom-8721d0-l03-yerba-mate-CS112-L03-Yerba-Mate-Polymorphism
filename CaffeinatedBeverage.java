public class CaffeinatedBeverage
{
    // constant variables
    public static final String DEFAULT_NAME = "Caffeine Fix";
    public static final int DEFAULT_OUNCES = 16;
    public static final double DEFAULT_PRICE = 0.99;

    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
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
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }

    public String toString() {
        return String.format("CaffeinatedBeverage: name = %s, %d fl. oz., $%.2f", this.name, this.ounces, this.price);
    }
}