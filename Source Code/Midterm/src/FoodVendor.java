public class FoodVendor {
    String cafeName;
    int zone;
    boolean freeDelivery;

    public FoodVendor (String cafeNameIn, int zoneIn, boolean freeDeliveryIn) {
        cafeName = cafeNameIn;
        zone = zoneIn;
        freeDelivery = freeDeliveryIn;
    }
    public String getCafeName() {
        return cafeName;
    }

    public int getZone() {
        return zone;
    }

    public boolean isFreeDelivery() {
        return freeDelivery;
    }

    public void setFreeDelivery(boolean freeDelivery) {
        this.freeDelivery = freeDelivery;
    }
}
