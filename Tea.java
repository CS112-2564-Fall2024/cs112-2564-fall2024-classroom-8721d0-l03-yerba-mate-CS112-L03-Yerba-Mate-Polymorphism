public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super("Default Tea", 1, 1);
        this.brewTemp = 100;
    }
   
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    public String getBrewTemp() {
        return String.valueOf(this.brewTemp);
    }

    public void setBrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    }

    @Override
    public String toString() {
        return ("Tea: " + getName() + ", " + getOunces() + "ounces"  + ", " + "brewed @ " + this.brewTemp  + ", " + "$" + getPrice());
    }
    
    public Tea(Tea other) {
        super(other.getName(), other.getOunces(), other.getPrice());
        this.brewTemp = other.brewTemp;
    }
}
