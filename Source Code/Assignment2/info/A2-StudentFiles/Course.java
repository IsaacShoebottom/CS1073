/**
This class represents a Course.
@author Leah Bidlake
*/

public class Course{

	//Instance variables:
    //For each Course object, store its name, semester, year, and the
    //number of students enrolled in the course so far.
	private String name;
	private String semester;
	private int year;
	private int students;
	

	//The constructor creates a new Course object and initializes the
    //instance variables.
	public Course(String nameIn, String semesterIn, int yearIn){ 
		name = nameIn;
		semester = semesterIn;
		year = yearIn;
		students = 0;	//no students have been added to the course
	}

	//This is a method that we can call on a Course object
    //(Specifically, it is an accessor method). This method
    //creates and returns a String containing all the information
    //about the state of the object.
    public String toString(){
		return name + 
				" offered " + semester + 
				" " + year +
				" Students: " + students;
	}

}