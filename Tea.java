public class Tea extends CaffeinatedBeverage {

    public static final int DEFAULT_BREW_TEMP = 90;

    // INSTANCE VARIABLES
    private int brewTemp;

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        if (!this.setBrewTemp(brewTemp)) {
            System.out.println("EROOR: Bad data given to full Tea constructor");
            System.exit(0);
        }
    }

    public Tea() {
        super();
        this.setBrewTemp(DEFAULT_BREW_TEMP);
    }

    public Tea(Tea original) {
        if (original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.brewTemp);
        } else{
            System.out.println("ERROR: null data given to copy Tea contructor");
            System.exit(0);
        }
    }

    // ACCESSOR
    public int getBrewTemp() {
        return this.brewTemp;
    }

    // MUTATOR
    public boolean setBrewTemp(int brewTemp) {
        if (brewTemp > 0) {
            this.brewTemp = brewTemp;
            return true;
        } else {
            return false;
        }
    }


    // METHODS
    public boolean setAll(String name, int ounces, double price, int brewTemp) {
        return super.setAll(name, ounces, price) && this.setBrewTemp(brewTemp);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Tea && super.equals(other)) {
            Tea otherTea = (Tea) other;
            return this.brewTemp == otherTea.brewTemp;
        }
        return false;
    }

    @Override
    public String toString() {
        String caffeineString = super.toString();
        int colonLocation = caffeineString.indexOf(":");
        caffeineString = caffeineString.substring(colonLocation + 2);

        return String.format("Tea: %s, brewed @ %d°C", caffeineString, this.brewTemp);
    }
}
