import java.text.NumberFormat;

public class Tea extends CaffeinatedBeverage {
    protected int brewTemp;

    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();


    protected Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;

    }

    protected boolean equals(Tea other) {
        if (other instanceof Tea && super.equals(other)) {
            return this.brewTemp == ((Tea) other).brewTemp;
            
        }
        return false;

    }

    // Getter 
    public int getbrewTemp() {
        return this.brewTemp;
    }

    // Setter
    public void setbrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    }

    public String toString() {
        return "Tea:" + this.name + ", " + this.ounces + " ounces, brewed @ " + this.brewTemp + "C, " + currency.format(this.price);
    }
}
