import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ResortBooking {
    String name;
    TouristPackageBooking tTourist;
    ElitePackageBooking eTourist;
    NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.CANADA);

    ResortBooking(TouristPackageBooking touristIn, String name) {
        tTourist = touristIn;
        this.name = name;
    }
    ResortBooking(ElitePackageBooking touristIn, String name) {
        eTourist = touristIn;
        this.name = name;
    }

    String getBuildingNumber(TouristPackageBooking tourist) {
        return "Building Number: " + tourist.getBuildingNumber();
    }
    String getBuildingNumber(ElitePackageBooking tourist) {
        return "Building Number: " + tourist.getBuildingNumber();
    }

    String getTotalCost(TouristPackageBooking tourist) {
        return "Total price for this package: " + cf.format(tourist.getTotalCost());
    }
    String getTotalCost(ElitePackageBooking tourist) {
        return "Total price for this package: " + cf.format(tourist.getTotalCost());
    }
}
