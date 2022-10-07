/**
 * This class holds info for the lent item
 * @author Isaac Shoebottom (3429069)
 */

public class LendingItem {
    private final String description;
    private final double price;
    private final boolean recommended;

    /**
     * Constructor for items
     * @param description Description of item
     * @param price The price of the item
     * @param recommended If the item is recommended or not
     */
    public LendingItem(String description, double price, boolean recommended) {
        this.description = description;
        this.price = price;
        this.recommended = recommended;
    }

    /**
     * Gets the description of item
     * @return The item description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price of the item
     * @return The price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets if the item is recommended by the book club
     * @return Boolean of if the item is recommended by the book club
     */
    public boolean isBookClubRecommended() {
        return recommended;
    }
}
	