/**
 * This class describes a polygonal corral with each side of equal length. It takes a length and a number of sides.
 * @author Isaac Shoebottom (3429069)
 */

public class PolygonalCorral {
    /**
     * The unit price is how much the fence costs per meter
     */
    final double unitPrice = 9.50;
    /**
     * The length is how long each side of the polygonal corral is in meters
     */
    double length;
    /**
     * The number of sides in the polygonal corral
     */
    long numberOfSides;

    /**
     * The polygonal corral method contains the length and number of sides
     * @param length The length of the sides of the polygonal corral in meters
     * @param numberOfSides The number of sides of the polygonal corral
     */
    PolygonalCorral (double length, long numberOfSides) {
        this.length = length;
        this.numberOfSides = numberOfSides;
    }

    /**
     * Method to get the length of the polygonal corrals sides
     * @return The length of the corrals sides in meters
     */
    public double getLength() {
        return length;
    }

    /**
     * Method to get the number of sides of the polygonal corral
     * @return The number of sides of the polygonal corral
     */
    public long getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * Method to get the unit price of a meter of fence
     * @return The price of a meter of fence
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Method to get the total cost of the polygonal fence
     * @return The cost of the polygonal fence
     */
    public double getTotalFenceCost() {
        return (length*numberOfSides*unitPrice);
    }

    /**
     * Method to get the area of the polygonal corral
     * @return The area of the polygonal corral in meters squared
     */
    public double getArea() {
        double radians = (180/(double)numberOfSides)*(Math.PI/180);
        double apothem = length/(2*Math.tan(radians));
        return (0.5*(length*numberOfSides)*apothem);
    }

}
