/**
	This is an example of a driver class; its purpose
	is to try out the Course class.
	@author Leah Bidlake
 	@author Isaac Shoebottom (3429069)
*/

public class CourseDriver{

	public static void main(String[] args){
	
	//Create some Course objects
	Course course1 = new Course("CS1073", "Fall", "Mr. Don Clement",2020);
	Course course2 = new Course("CS1083", "Winter", "Dr. Harvey Ingrid",2021);
	Course course3 = new Course("MATH1013", "Summer", "Mrs. Lee Smith" ,2021);
	Course course4 = new Course("ENG1104", "Fall", "Ms. Kate Free", 2022);

	/* Add the appropriate statements to record the fact that 23 students have
	been added to CS1073, 17 students have been added to CS1083, and 31
	students have been added to MATH1013. Then, provide another
	statement to record the fact that 14 more students have been added to
	CS1073. Position these four statements after the objects are created and
	before they are printed out. */
	course1.addStudents(23);
	course2.addStudents(17);
	course3.addStudents(31);
	course1.addStudents(14);

	System.out.println("23 students have been added to CS1073");
	System.out.println("17 students have been added to CS1083");
	System.out.println("31 students have been added to MATH1013");
	System.out.println("14 students have been added to CS1073");


	//Now I can print out my courses to confirm they 
	//were created properly
	System.out.println("course1: " + course1.Output());
	System.out.println("course2: " + course2.Output());
	System.out.println("course3: " + course3.Output());
	System.out.println("course4: " + course4.Output());


	}

}
