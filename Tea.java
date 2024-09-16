public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super();
        this.brewTemp = 0;
    }

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    public void setBrewTemp() {
        this.brewTemp = brewTemp;
    }

    public int getBrewTemp() {
        return this.brewTemp;
    }

    @Override
    public String toString() {
        String superString = super.toString();

        return superString + " " + this.brewTemp;
    }

}
