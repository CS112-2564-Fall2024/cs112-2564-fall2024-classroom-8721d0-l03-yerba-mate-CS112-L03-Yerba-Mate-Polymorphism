public class YerbaMate extends Tea 
{
    int numPasses;

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses)
    {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }
    
    public YerbaMate()
    {
        super();
        this.numPasses = 0;
    }

    public int getNumPasses()
    {
        return numPasses;
    }

    public void setNumPasses(int numPasses)
    {
        this.numPasses = numPasses;

    }
    @Override
    public boolean equals(Object o) {
        
        if (o == null || this.getClass() != o.getClass())
            return false;
        YerbaMate that = (YerbaMate) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name) && this.brewTemp == that.brewTemp && this.numPasses == that.numPasses;
    }
    @Override
    public String toString()
    {

        return String.format("Yerba Mate: %S, %d ounces, brewed @ %d\u00B0C, $%.2f, %d passes so far", name, ounces, brewTemp, price, numPasses);
    }
    
    public int refill(int ounces) 
    {
        return this.ounces += ounces;
    }

    public int passMate()
    {
        return numPasses + 1;
    }
}

