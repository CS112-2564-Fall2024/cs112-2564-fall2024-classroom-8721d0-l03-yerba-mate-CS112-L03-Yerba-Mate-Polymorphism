public class YerbaMate extends Tea {

    public static final int DEFAULT_NUM_PASSES = 0;

    private int numPasses;
    /*
     * full constructor
     */
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        if (!this.setNumPasses(numPasses)) {
            System.out.println("ERROR: Bad data given to full YerbaMate constructor");
            System.exit(0);
        }
    }

    /*
     * default constructor
     */
    public YerbaMate() {
        super();
        this.setNumPasses(DEFAULT_NUM_PASSES);
    }

    /*
     * copy constructor
     */
    public YerbaMate(YerbaMate original) {
        if (original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.getBrewTemp(),
                    original.numPasses);
        } else {
            System.out.println("ERROR: null data given to copy YerbaMate constructor. ");
            System.exit(0);
        }
    }

    // setters
    private boolean setNumPasses(int numPasses) {
        if (numPasses >= 0) {
            this.numPasses = numPasses;
            return true;
        } else {
            return false;
        }
    }

    private boolean setAll(String name, int ounces, double price, int brewTemp, int numPasses) {
        return super.setAll(name, ounces, price, brewTemp) && this.setNumPasses(numPasses);
    }

    public void passMate() {
        this.numPasses++;
        System.out.println("Passed the mate, current # of passes: " + this.numPasses);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Tea && super.equals(other)) {
            YerbaMate otherYerbaMate = (YerbaMate) other;
            return this.numPasses == otherYerbaMate.numPasses;
        }
        return false;
    }

    @Override
    public String toString() {
        String teaString = super.toString();
        int colonLocation = teaString.indexOf(":");
        teaString = teaString.substring(colonLocation + 2);

        return String.format("YerbaMate: %s, %d passes so far", teaString, this.numPasses);
    }
}
