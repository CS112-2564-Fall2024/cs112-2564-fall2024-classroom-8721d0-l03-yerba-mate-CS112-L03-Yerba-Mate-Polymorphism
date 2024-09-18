public class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate() {
        super("Default Yerba Mate", 16, 5.0, 160); 
        this.numPasses = 1;
    }
   
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public String numPasses() {
        return String.valueOf(this.numPasses);
    }

    public void setBrewTemp(int numPasses) {
        this.numPasses = numPasses;
    }

    @Override
    public String toString() {
        return ("Tea: " + getName() + ", " + getOunces() + "ounces"  + ", " + "brewed @ " + getBrewTemp()  + ", " + "$" + getPrice() + ", " + this.numPasses + " passes so far");
    }
    
    public void refill(int ounces) {
        super.ounces += ounces;
    }

    public void printPasses(){
        System.out.println("The Mate has been passed. The pass count is now: " + numPasses);
    }

    public void passMate() {
        numPasses += 1;
        printPasses();
    }

    public boolean equals(Object other) {
        if (other instanceof YerbaMate && super.equals(other)) {
            return this.numPasses == ((YerbaMate) other).numPasses;
        }
        return false;
    }
    
}


