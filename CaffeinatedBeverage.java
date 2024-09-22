public class CaffeinatedBeverage
{
    public String name;
    public int ounces;
    public double price;

    public CaffeinatedBeverage()
    {
        this.name = "Unknown";
        this.ounces = 0;
        this.price = 0.0;
    }

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }
    
    public CaffeinatedBeverage(CaffeinatedBeverage other)
    {
        if (other == null)
        {
            System.out.println("Error");
            System.exit(0);
        } else {
            this.name = other.name;
            this.ounces = other.ounces;
            this.price = other.price;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setOunces(int ounces) 
    {
        if (ounces >= 0)
        {
            this.ounces = ounces;
        }
        else 
        {
        System.out.println("Invalid Number");   
        }
    }

    public void setAll(String name, int ounces, double price) 
    {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0)
        {
            this.price = price;
        }
        else 
        {
            System.out.println("Invaild number");   
        }
    }

    public String toString()
    {
        return String.format("Drink: %S, %d ounces, $%f", name, ounces, price);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }
    
    public boolean sip(int sip)
    {
        if(sip >= ounces)
        {
        ounces = 0;
        return false;
        }else
        {
        ounces -= sip;
        return true;
        }
    }
}