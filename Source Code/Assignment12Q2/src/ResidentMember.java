/**
 * This class holds info for members
 * @author Isaac Shoebottom (3429069)
 */


public class ResidentMember {
    private static int membership = 9999;
    private final String name;
    private final int room;
    private final LendingItem[] list;
    private String phone;
    private int bookCounter;

	/**
	 * Constructor for members
	 * @param name Name of member
	 * @param room Room of member
	 * @param phone Phone of member
	 */
    public ResidentMember(String name, int room, String phone) {
        this.name = name;
        this.room = room;
        this.phone = phone;
        list = new LendingItem[8];
        bookCounter = 0;
		membership++;
    }

	/**
	 * Get the signed out items of a member
	 * @return The updated list item list
	 */
	public LendingItem[] getSignedOutItems() {
		LendingItem[] updatedItemList = new LendingItem[bookCounter];
		for (int i = 0; i < bookCounter; i++) {
			updatedItemList[i] = list[i];
		}
		return updatedItemList;
	}

	/**
	 * Method to sign out items for members
	 * @param input The item to be lent
	 * @return Boolean for if the item was signed out or not
	 */
	public boolean signOut(LendingItem input) {
        if (bookCounter < 8) {
            list[bookCounter] = input;
            bookCounter++;
            return true;
        }
        return false;
    }

	/**
	 * Returns and item for members
	 * @param input The item to be returned
	 * @return Boolean if the item was returned
	 */
	public boolean returnItem(LendingItem input) {
        boolean success = false;
        for (int i = 0; i < bookCounter; i++) {
            if (list[i] == input) {
                list[i] = list[bookCounter - 1];
                bookCounter--;
				success = true;
            }
        }
        return success;
    }

	/**
	 * Gets the name of member
	 * @return The name of member
	 */
    public String getName() {
        return name;
    }

	/**
	 * Gets the room of member
	 * @return The room of member
	 */
	public int getRoomNumber() {
        return room;
    }

	/**
	 * Gets the phone number of member
	 * @return The phone number of member
	 */
	public String getPhoneNumber() {
        return phone;
    }

	/**
	 * Sets the phone of member
	 * @param phone
	 */
	public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

	/**
	 * Gets the membership number of member
	 * @return The membership number of member
	 */
	public int getMembershipNumber() {
        return membership;
    }

}