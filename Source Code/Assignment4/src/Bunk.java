/**
@author Isaac Shoebottom (3429069)
**/

public class Bunk {
    private String cabinName;
    private long bedNumber;
    private double bedCost;

    /**
     * Bunk Object, constructor has 3 variables
     * @param cabinNameIn The cabin name constructor parameter
     * @param bedNumberIn The bed number constructor parameter
     * @param bedCostIn The bed cost constructor parameter
     */
    public Bunk(String cabinNameIn, long bedNumberIn, double bedCostIn) {
        this.cabinName = cabinNameIn;
        this.bedNumber = bedNumberIn;
        this.bedCost = bedCostIn;
    }

    /**
     * Gets the cost of the bed for the bunk
     * @return (double) The cost of the bed
     */
    public double getBedCost() {
        return bedCost;
    }

    /**
     * Gets the bed number of the bed
     * @return (long) The number of the bed
     */
    public long getBedNumber() {
        return bedNumber;
    }

    /**
     * Gets the cabin name
     * @return (String) The cabin's name
     */
    public String getCabinName() {
        return cabinName;
    }
}
