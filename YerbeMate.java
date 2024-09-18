public class YerbeMate extends Tea {
    private int numPasses;

    public YerbeMate() {
        super();
        this.numPasses = 0;
    }

    public YerbeMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public void setNumPasses(int numPasses) {
        this.numPasses = numPasses;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return String.format("%s, %d passes so far", superString, this.numPasses);

    }

    public boolean equals(Object other) {
        if (other instanceof YerbeMate && super.equals(other)) {
            YerbeMate otherYerbeMate = (YerbeMate) other;
            return this.numPasses == otherYerbeMate.numPasses;
        }
        return false;
    }

    public boolean refill(int ounces) {
        int Ounces = getOunces();
        if (ounces == 0) {
            ounces = Ounces;
            setOunces(ounces);
            return true;
        } else 
        {
            return false;
        }
    }


}
