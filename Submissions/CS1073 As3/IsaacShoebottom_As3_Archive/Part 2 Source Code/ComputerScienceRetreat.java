/**
 @author Isaac Shoebottom (3429069)
 **/
public class ComputerScienceRetreat {
    public static void main(String[] args){
        runRetreat();
    }

    private static void runRetreat(){
        ActivityTab dawnsTab = new ActivityTab("Dawn MacIsaac", 42, 0.00);
        dawnsTab.addAmountOwed(3.25);

        ActivityTab luigisTab = new ActivityTab("Luigi Benedicenti", 112, 0.00);
        luigisTab.addAmountOwed(8.50);

        ActivityTab nataliesTab = new ActivityTab("Natalie Webber", 214, 0.00);
        nataliesTab.addAmountOwed(4.00);
        nataliesTab.addAmountOwed(6.00);

        ActivityTab leahsTab = new ActivityTab("Leah Bidlake", 78, 0.00);
        leahsTab.addAmountOwed(7.75);

        nataliesTab.addAmountOwed(5.25);
        leahsTab.addAmountOwed(5.25);

        luigisTab.addAmountOwed(11.75);

        dawnsTab.addAmountOwed(2.60);

        System.out.println("dawnsTab:" +
                "\n    Name: " + dawnsTab.getName() +
                "\n    Room Number: " + dawnsTab.getRoomNumber() +
                "\n    Amount Owed: $" + dawnsTab.getAmountOwed());

        System.out.println("luigisTab:" +
                "\n    Name: " + luigisTab.getName() +
                "\n    Room Number: " + luigisTab.getRoomNumber() +
                "\n    Amount Owed: $" + luigisTab.getAmountOwed());

        System.out.println("nataliesTab:" +
                "\n    Name: " + nataliesTab.getName() +
                "\n    Room Number: " + nataliesTab.getRoomNumber() +
                "\n    Amount Owed: $" + nataliesTab.getAmountOwed());

        System.out.println("leahsTab:" +
                "\n    Name: " + leahsTab.getName() +
                "\n    Room Number: " + leahsTab.getRoomNumber() +
                "\n    Amount Owed: $" + leahsTab.getAmountOwed());

        System.out.print("\n");
        System.out.println(leahsTab.getName() +" leaves a $" + leahsTab.processTip(18) + " tip");
        System.out.println(nataliesTab.getName() + " leaves a $" + leahsTab.processTip(15) + " tip");
        System.out.println(dawnsTab.getName() + " leaves a $" + dawnsTab.processTip(20) + " tip");
        System.out.println(luigisTab.getName() + " leaves a $" + luigisTab.processTip(20) + " tip");
    }
}
