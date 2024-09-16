public class YerbaMate extends Tea {
    private int numPasses;
   
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public String numPasses() {
        return String.valueOf(this.numPasses);
    }

    public void setBrewTemp(int numPasses) {
        this.numPasses = numPasses;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "Ounces: " + getOunces() + "Price: " + getPrice() + "Brew Temp: " + getBrewTemp()
                + "Num Passes: " + this.numPasses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check if they are the same object
        if (o == null || getClass() != o.getClass()) return false; // Check if o is of type YerbaMate

        YerbaMate that = (YerbaMate) o; 
        return numPasses == that.numPasses && 
                getBrewTemp() == that.getBrewTemp() && 
                getOunces() == that.getOunces() && 
                Double.compare(that.getPrice(), getPrice()) == 0 && 
                getName().equals(that.getName()); 
    }
    
    public void refill(int ounces) {
        super.ounces += ounces;
    }

    public void passMate() {
        numPasses += 1;
    }
    
}


