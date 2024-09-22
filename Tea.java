public class Tea extends CaffeinatedBeverage
{
    int brewTemp;

    public Tea (String name, int ounces, double price, int brewTemp)
    {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }
    
    public Tea()
    {
        super();
        this.brewTemp = 0;
    }

    public Tea(Tea other)
    {
        if (other == null)
        {
            System.out.println("Error");
            System.exit(0);
        } else {
            super.setAll(getName(), getOunces(), getPrice());
            this.brewTemp = other.brewTemp;
        }
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

    public void setAll(String name, int ounces, double price, int brewTemp) 
    {
        super.setAll(name, ounces, price);
        this.brewTemp = brewTemp;
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
        return String.format("Tea: %S, %d ounces, brewed @ %d\u00B0C, $%.2f", name, ounces, brewTemp, price);
    }

    
}

