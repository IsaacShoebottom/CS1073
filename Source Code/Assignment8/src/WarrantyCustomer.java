/**
 * This class contains a customer that has a warranty. It contains the customers name, car model and overridden methods pertaining to that the customer is a warranty owner
 * @author Isaac Shoebottom (3429069)
 */

public class WarrantyCustomer extends Customer {
    /**
     * (long) The time since the last discount for being a warrenty owned was applied
     */
    private long monthsSinceLastDiscount = 0;

    /**
     * Warranty customer constructor, it stores the customers name and car model
     * @param customer The customers name
     * @param car The customers car model
     */
    WarrantyCustomer(String customer, String car) {
        super(customer, car);
    }

    /**
     * The overridden method that applies a discount if the user has not used their discount in 12 months
     * @return The cost of the visit
     */
    @Override
    double getNextVisitCost() {
        if (monthsSinceLastDiscount >= 12) {
            monthsSinceLastDiscount = 0;
            return (0.8 * super.getNextVisitCost());
        }
        return super.getNextVisitCost();
    }

    /**
     * Method specific to the warranty owners, increases the months since last discount as well as months since last visit
     */
    @Override
    void incMonthsSinceVisit() {
        super.incMonthsSinceVisit();
        monthsSinceLastDiscount++;
    }

    /**
     * Create an invoice for warranty owners, includes the months since the last time the discount was applies
     * @return The customers invoice, includes the last time the warranty discount was applied
     */
    @Override
    String createVisitInvoice() {
        long tempMonthsSinceLastDiscount = monthsSinceLastDiscount;
        return(
                super.createVisitInvoice() +
                "\n\t\tmonths since discount: " + tempMonthsSinceLastDiscount + "\t(has warranty)"
                );
    }
}