import java.text.NumberFormat;
import java.util.Locale;

/**
 * The customer class holds the name and car and methods relating to costs and last time visited
 * @author Isaac Shoebottom (3429069)
 */

public class Customer {
    /**
     * (String) customer name
     */
    private final String customer;
    /**
     * (String) car name
     */
    private final String car;
    /**
     * (long) The time in months since the last time the customer has visited
     */
    private long monthsSinceVisit = 0;

    /**
     * Currency formatter
     */
    NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.CANADA);

    /**
     * The constructor for the customer class, stores the customers name and car model
     * @param customer The customers name
     * @param car The customers car model
     */
    Customer(String customer, String car) {
        this.customer = customer;
        this.car = car;
    }

    /**
     * Increases the months since the last time the customer has visited
     */
    void incMonthsSinceVisit() {
        monthsSinceVisit++;
    }

    /**
     * Get the months since the last time the customers has visited
     * @return The months since the last time the customer has visited
     */
    long getMonthsSinceVisit() {
        return monthsSinceVisit;
    }

    /**
     * The cost of the next visit
     * @return The cost of the next visit in double format
     */
    double getNextVisitCost() {
        return (20.00 + (monthsSinceVisit*12.00));
    }

    /**
     * Create an invoice containing the customers name, car model, last time the visited and the cost of the visit
     * @return A string containing the customers name, car model, last time the visited and the cost of the visit
     */
    String createVisitInvoice() {
        double cost = getNextVisitCost();
        long lastVisit = getMonthsSinceVisit();
        monthsSinceVisit = 0;
        return (
                "INVOICE\tfor: " + customer + "\n" +
                "\t\tmodel:  " + car + "\n" +
                "\t\tlast visit: " + lastVisit + "\n" +
                "\t\tnext visit cost: " + cf.format(cost));
    }
}