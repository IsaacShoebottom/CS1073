/**
 @author Isaac Shoebottom (3429069)
 **/

public class As4TestDriver {

    public static void main(String[] args) {
        Bunk bunk1 = new Bunk("Chickadee Lodge", 7, 155.75);
        Camper camper1 = new Camper("Anna Marie Sullivan", 250.00, 148.30, 150.00, bunk1);
        Bunk bunk2 = new Bunk("Moose Hall", 16, 131.25);
        Camper camper2 = new Camper("Porter Smith", 340.00, 277.88, 0.00, bunk2);
        Bunk bunk3 = new Bunk("Brookside Cabin", 11, 385.00);
        Camper camper3 = new Camper("Kathrine Doucet", 565.30, 0.00, 175.00, bunk3);

        camper1.setExcursionFees(178.80);

        Bunk bunk4 = new Bunk("Wolf Lodge", 9, 147.00);
        camper2.setBunk(bunk4);

        camper3.setCampFees(525.00);

        System.out.println(camper1.getOnSiteMailLabel() + "\nOwed Fees: " + camper1.getTotalWeeklyFeesOwing() + "$");
        System.out.println();
        System.out.println(camper2.getOnSiteMailLabel() + "\nOwed Fees: " + camper2.getTotalWeeklyFeesOwing() + "$");
        System.out.println();
        System.out.println(camper3.getOnSiteMailLabel() + "\nOwed Fees: " + camper3.getTotalWeeklyFeesOwing() + "$");
    }
}
