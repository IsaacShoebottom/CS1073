public class TouristPackageBooking {
    final double basePrice = 1475.00;
    long aLaCarteMeals;
    long spaVisits;

    TouristPackageBooking(long aLaCarteMeals, long spaVisits) {
        this.aLaCarteMeals = aLaCarteMeals;
        this.spaVisits = spaVisits;
    }
    double getTotalCost() {
        double spaVisitCosts = 0;
        if (spaVisits == 1) {
            spaVisitCosts = 125.00;
        }
        else if (spaVisits > 1) {
            spaVisitCosts = 125 + ((spaVisits - 1) * 100);
        }
        return (basePrice + (aLaCarteMeals*35.00) + spaVisitCosts);
    }
    int getBuildingNumber() {
        return (int)((Math.random() * (5-2) + 2));
    }
}
