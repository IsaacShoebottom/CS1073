/**
@author Isaac Shoebottom (3429069)
 **/
public class ActivityTab {

    //Initialize name in class
    private final String name;

    //Initialize room number in class
    private final int roomNumber;

    //Initialize amount owed
    private double amountOwed;

    /**Make the class to hold the information for the name, room number and amount owed
     * @param nameIn The name of the person to be put on file
     * @param roomNumberIn The room number the person on file is to be put in
     * @param amountOwedIn The amount owed when initializing the class (Always 0.00 as of now, can be changed for modularity)
     */
    public ActivityTab(String nameIn, int roomNumberIn, double amountOwedIn){
        this.name = nameIn;
        this.roomNumber = roomNumberIn;
        this.amountOwed = amountOwedIn;
    }

    /**Getter method to get the amount owed
     * @return amountOwed The amount of money the person owes at the time called
     */
    public double getAmountOwed() {
        return this.amountOwed;
    }

    /**
     * Getter method to get the name of person on tab
     * @return name The name of the person on file
     */
    public String getName(){
        return this.name;
    }

    /**Getter to get the room number of person on tab
     * @return roomNumber The room number of the person on file
     */
    public int getRoomNumber(){
        return this.roomNumber;
    }

    /**Accumulator to add the amount that the person owes to their total
     * @param activityPrice The price of the activity
     */
    public void addAmountOwed(double activityPrice){
        this.amountOwed = this.amountOwed + activityPrice;
    }

    /**Calculate the tip with the percentage they wish to use
     * @param percentageAmount The percentage amount (e.g. 18% = 18)
     * @return A double representing the tip the person will pay
     */
    public double processTip(double percentageAmount){
        return (this.amountOwed * (percentageAmount/100));
    }
}
