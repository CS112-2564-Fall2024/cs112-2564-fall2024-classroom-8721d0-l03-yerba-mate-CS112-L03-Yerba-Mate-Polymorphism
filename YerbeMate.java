public class YerbeMate extends Tea {
    private int numPasses;
    
    private YerbeMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses=numPasses;
    }
}
