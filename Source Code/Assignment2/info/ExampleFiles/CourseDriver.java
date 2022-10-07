/**
This is an example of a driver class; its purpose
is to try out the Course class.
@author Leah Bidlake
*/

public class CourseDriver{

	public static void main(String[] args){
	
	//Create some Course objects
	Course course1 = new Course("CS1073", "Fall", 2020);		
	Course course2 = new Course("CS1083", "Winter", 2021);		
	Course course3 = new Course("MATH1013", "Summer", 2021);	
	

	//Now I can print out my courses to confirm they 
	//were created properly
	System.out.println("course1: " + course1.toString());
	System.out.println("course2: " + course2.toString());
	System.out.println("course3: " + course3.toString());

	}

}
