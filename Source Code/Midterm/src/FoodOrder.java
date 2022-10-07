public class FoodOrder {
    String foodOrdered;
    int zoneNumber;
    double foodCost;
    FoodVendor vendor;

    public FoodOrder (String foodOrderedIn, int zoneNumberIn, double foodCostIn, FoodVendor vendorIn) {
        foodOrdered = foodOrderedIn;
        zoneNumber = zoneNumberIn;
        foodCost = foodCostIn;
        vendor = vendorIn;
    }
    public double getTotalCost() {
        if (vendor.isFreeDelivery()) {
            if (foodCost < 20.00) {
                if (vendor.getZone() == zoneNumber) {
                    return (foodCost + (foodCost * 0.15));
                }
                else {
                    return (foodCost + (foodCost*0.20));
                }
            }
            else {
                return foodCost;
            }
        }
        else {
            if (vendor.getZone() == zoneNumber) {
                return (foodCost + (foodCost * 0.15));
            }
            else {
                return (foodCost + (foodCost*0.20));
            }
        }
    }
}
