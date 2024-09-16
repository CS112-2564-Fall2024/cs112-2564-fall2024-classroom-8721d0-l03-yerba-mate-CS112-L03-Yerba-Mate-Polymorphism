import java.text.NumberFormat;

public class Tea extends CaffeinatedBeverage {
    protected int brewTemp;

    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();


    protected Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;

    }

    protected boolean equals(Tea other) {
        return this.name.equals(other.name)
                && this.ounces == other.ounces
                 && this.price == other.price
                && this.brewTemp == other.brewTemp;
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
        return "Tea:" + this.name + ", " + this.ounces + "ounces, brewed @ " + this.brewTemp + "C, " + currency.format(this.price);
    }
}
