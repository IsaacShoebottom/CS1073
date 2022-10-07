/**
 @author Isaac Shoebottom (3429069)
 **/

public class Camper {
    private String camperName;
    private double campFees;
    private double excursionFees;
    private double fundingSupport;
    private Bunk bunk;

    /**
     * Camper object, constructor has 5 parameters
     * @param camperNameIn The camper's name
     * @param campFeesIn The camper's fees
     * @param excursionFeesIn The camper's external excursion fees
     * @param fundingSupportIn The camper's funding
     * @param bunkIn The camper's bunk they are staying in
     */
    public Camper(String camperNameIn, double campFeesIn, double excursionFeesIn, double fundingSupportIn, Bunk bunkIn)  {
        this.camperName = camperNameIn;
        this.campFees = campFeesIn;
        this.excursionFees = excursionFeesIn;
        this.fundingSupport = fundingSupportIn;
        this.bunk = bunkIn;
    }

    /**
     * Method to set the camper's name
     * @param camperName The camper's name
     */
    public void setCamperName(String camperName) {
        this.camperName = camperName;
    }

    /**
     * Method to set the camper's fees
     * @param campFees The fees the camper owes
     */
    public void setCampFees(double campFees) {
        this.campFees = campFees;
    }

    /**
     * Method to set the excursion fees
     * @param excursionFees The camper's excursion fees
     */
    public void setExcursionFees(double excursionFees) {
        this.excursionFees = excursionFees;
    }

    /**
     * Method to set the funding support
     * @param fundingSupport The camper's funding they have received
     */
    public void setFundingSupport(double fundingSupport) {
        this.fundingSupport = fundingSupport;
    }

    /**
     * Method to set the bunk the camper is staying in
     * @param bunkIn The bunk the camper is staying in
     */
    public void setBunk(Bunk bunkIn) {
        this.bunk = bunkIn;
    }

    /**
     * Method to get the combined fees of all the campers
     * @return (double) The total amount owed which is all the costs incurred minus funding
     */
    public double getTotalWeeklyFeesOwing() {
        return ((this.campFees + this.excursionFees + bunk.getBedCost()) - this.fundingSupport);
    }

    /**
     * Method to get a mailing label for a camper
     * @return (String) The campers name and bed number in the format of a combined string
     */
    public String getOnSiteMailLabel() {
        return (this.camperName + "\n" + bunk.getCabinName() + ", bed " + bunk.getBedNumber());
    }
}
