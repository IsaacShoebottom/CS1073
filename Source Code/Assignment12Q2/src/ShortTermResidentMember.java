/**
 * This class holds info for short term members
 * @author Isaac Shoebottom (3429069)
 */


public class ShortTermResidentMember extends ResidentMember {
    private final String departureDate;

    /**
     * Constructor for short term members
     * @param name Name of short term member
     * @param room Room of short term member
     * @param phone Phone of short term member
     * @param departureDate The departure date of short term members
     */
    public ShortTermResidentMember(String name, int room, String phone, String departureDate) {
        super(name, room, phone);
        this.departureDate = departureDate;
    }

    /**
     * Method to sign out items for short term members
     * @param input The item to be signed out
     * @return Boolean for if the item was signed out or not
     */
    public boolean signOut(LendingItem input) {
        if (input.isBookClubRecommended()) {
            super.signOut(input);
            return true;
        }
        return false;
    }

    /**
     * Gets the departure date for short term members
     * @return The departure date
     */
    public String getDepartureDate() {
        return departureDate;
    }

}