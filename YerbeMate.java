import java.text.NumberFormat;
public class YerbeMate extends Tea {
    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();
    private int numPasses;
    
    private YerbeMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }
    
    public String toString() {
        return "Yerbe Mate: " + this.name + ", " + this.ounces + " ounces, brewed at" + this.brewTemp + " C,"
                + currency.format(this.price) + ", " + this.numPasses + " passes so far";
    }

    private boolean equals(YerbeMate other) {
        return this.name.equals(other.name)
                && this.ounces == other.ounces
                && this.price == other.price
                && this.brewTemp == other.brewTemp
                && this.numPasses == other.numPasses;
    }

    public int getNumPasses() {
        return this.numPasses;
    }

    public void setNumPasses(int numPasses) {
        this.numPasses = numPasses;
    }
    
    public int refill(int ounces) {
        this.ounces = this.ounces + ounces;
        return ounces;
    }

    public void passMate() {
        this.numPasses++;
    }
}
