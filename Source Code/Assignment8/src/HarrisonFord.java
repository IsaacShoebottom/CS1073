/**
	A driver class demonstrating the classes available in 
	for HarrisonFord customer management. 
	
	@author Scott Bateman
*/

public class HarrisonFord{
	
	public static void main(String[] args)
	{
		//creating test customers John, Harold and Beth

		//create one customer
		Customer john = new Customer("John Smith","Escape");
		
		//create two warranty customers
		WarrantyCustomer harold = new WarrantyCustomer("Harold Lee", "Fiesta");
		WarrantyCustomer beth = new WarrantyCustomer("Beth Blart", "Focus");

		//Displaying pretty text banner
		System.out.println();
		System.out.println("*********************************");
		System.out.println("* HARRISON FORD CUSTOMER SYSTEM *");
		System.out.println("*********************************");		

		//increment months since visit for each customer

		//it's been 1 month since john bought his car
		john.incMonthsSinceVisit();

		//it's been 3 months since harold bought his car
		harold.incMonthsSinceVisit();
		harold.incMonthsSinceVisit();
		harold.incMonthsSinceVisit();

		//it's been 4 months since beth bought her car
		beth.incMonthsSinceVisit();
		beth.incMonthsSinceVisit();
		beth.incMonthsSinceVisit();
		beth.incMonthsSinceVisit();

		//display report for Nov 1, 2019
		System.out.println("November 1, 2019\n----------------");
		System.out.println(john.createVisitInvoice());
		System.out.println();
		System.out.println(harold.createVisitInvoice());
		System.out.println();
		System.out.println(beth.createVisitInvoice());
		System.out.println();

		//using a loop to simulate the passage of a year
		int i = 0;
		while (i < 12)
		{
			//john and beth to not visit in the year
			john.incMonthsSinceVisit();
			beth.incMonthsSinceVisit();

			//harold really wants to keep his car in
			//good shape - he visits every month
			harold.incMonthsSinceVisit();

			//creating a visit for monthly visits
			//for Harold, but not displaying them
			harold.createVisitInvoice();
			i++;
		}
		
		//creating invoices for all customers
		System.out.println("November 1, 2020\n----------------");
		System.out.println(john.createVisitInvoice());
		System.out.println();
		System.out.println(harold.createVisitInvoice());
		System.out.println();
		System.out.println(beth.createVisitInvoice());
		System.out.println();
	}
}