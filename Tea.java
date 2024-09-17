public class Tea extends CaffeinatedBeverage
{
    int brewTemp;

    public Tea (String name, int ounces, double price, int brewTemp)
    {
        super();
        this.brewTemp = brewTemp;
    }
    
    public Tea()
    {
        super();
        this.brewTemp = 0;
    }

    public int getBrewTemp()
    {
        return brewTemp;
    }

    public void setBrewTemp(int brewTemp)
    {
        if (brewTemp >= 0) {
            this.brewTemp = brewTemp;
        } else {
            System.out.println("Invalid Temperature");
        }

    }
    
    @Override
    public boolean equals(Object o) {
        
        if (o == null || this.getClass() != o.getClass())
            return false;
        Tea that = (Tea) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name) && this.brewTemp == that.brewTemp;
    }
    @Override
    public String toString()
    {

        return String.format("Tea: %S, %d ounces, brewed @ %d%cC, $%f", name, ounces, brewTemp, "\u00B0", price);
    }
        }

