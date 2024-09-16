public class CaffeinatedBeverage
{
    protected String name;
    protected int ounces;
    protected double price;

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public String toString() {
        return "Name:" + name + ", Ounces:" + ounces + ", Price:" + price;
    }
    
    //if(ounces>=0 && price >=0) 
    public boolean sip(double sipAmount) {
        if (sipAmount >= ounces) {
            ounces = 0;
            return false;
        } else {
            ounces -= sipAmount;
            return true;
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

    public void setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
        }
        else {
            System.out.println("Invalid");
        }
        

    }

    public double getPrice() {
        
            return this.price;
        

    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
               this.name.equals(that.name);
    }
}