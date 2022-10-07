public class ElitePackageBooking extends  TouristPackageBooking{

    ElitePackageBooking(long aLaCarteMeals, long spaVisits) {
        super(aLaCarteMeals, spaVisits);
    }

    @Override
    double getTotalCost() {
        double aLaCarteMealsCost;
        if (aLaCarteMeals <= 3) {
            aLaCarteMealsCost = 0.00;
        }
        else {
            aLaCarteMealsCost = (aLaCarteMeals -3) * 35.00;
        }
        return ((super.basePrice+775) + (aLaCarteMealsCost) + (spaVisits*75));
    }

    @Override
    int getBuildingNumber() {
        return 1;
    }
}
