/**
 * This class describes a rectangular corral with a width and length
 * @author Isaac Shoebottom (3429069)
 */

public class RectangularCorral {
    /**
     * The width of the rectangular corral
     */
    double width;
    /**
     * The length of the rectangular corral
     */
    double length;
    /**
     * The price of fence per meter
     */
    final double unitPrice = 9.50;

    /**
     * The rectangular corral method contains the width and the height of the corral
     * @param width The width of the rectangular corral
     * @param length The length of the rectangular corral
     */
    RectangularCorral (double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Method to get the length of the rectangular corral
     * @return The length of the rectangular corral
     */
    public double getLength() {
        return length;
    }

    /**
     * Method to get the width of the rectangular corral
     * @return The width of the rectangular corral
     */
    public double getWidth() {
        return width;
    }

    /**
     * Method to get the price of fence per meter
     * @return The price of fence per meter
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Method to get the total cost of the rectangular fence
     * @return The total cost of the rectangular fence
     */
    public double getTotalFenceCost() {
        return ((length+width)*2*unitPrice);
    }

    /**
     * Method to get the area of a rectangular corral
     * @return The area of a rectangular corral
     */
    public double getArea() {
        return (length*width);
    }
}
