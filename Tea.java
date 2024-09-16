public class Tea extends CaffeinatedBeverage
{
    int brewTemp;

    public Tea (int brewTemp)
    {
        super();
        this.brewTemp = brewTemp;
    }

    public int getBrewTemp()
    {
        return brewTemp;
    }

    public void setBrewTemp(int brewTemp)
    {
        if(brewTemp >= 0)
        {
            this.brewTemp = brewTemp;
        } else {
            System.out.println("Invalid Temperature");
        }

    }
//@Override
    }

