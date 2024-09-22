public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage() {
        this.name = "none";
        this.ounces = 0;
        this.price = 0;
    }
    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
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
        if (price >= 0) {
            this.ounces = ounces;
        } else {
            System.out.println("Invalid Ounces!");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }

    public boolean sip(int sipAmount){
        ounces = getOunces();
        if (ounces >= sipAmount) {
            ounces = sipAmount - ounces;
            setOunces(ounces);
            return true;
        }
        else {
            setOunces(0);
            return false;
        }
    }

    public String toString() {
        return String.format("%s, %d ounces, $%.2f", this.name, this.ounces, this.price);
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