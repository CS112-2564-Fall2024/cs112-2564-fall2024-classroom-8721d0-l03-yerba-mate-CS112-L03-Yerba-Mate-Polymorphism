public class Tea extends CaffeinatedBeverage {
    private int brewTemp;
   
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
        return("Name: " + getName() + "Ounces: " + getOunces() + "Price: " + getPrice() + "Brew Temp: " + this.brewTemp);
    } 
}
