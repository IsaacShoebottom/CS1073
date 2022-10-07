/**
	This class represents a Course.
	@author Leah Bidlake
 	@author Isaac Shoebottom (3429069)
*/

public class Course{

	//Instance variables:
    //For each Course object, store its name, semester, year, and the
    //number of students enrolled in the course so far.
	private final String name;
	private final String semester;
	private final String instructor;
	private final int year;
	private int students;
	

	//The constructor creates a new Course object and initializes the
    //instance variables.
	public Course(String nameIn, String semesterIn, String instructorIn, int yearIn){
		this.name = nameIn;
		this.semester = semesterIn;
		this.instructor = instructorIn;
		this.year = yearIn;
		this.students = 0;	//no students have been added to the course
	}

	//This is a method that we can call on a Course object
    //(Specifically, it is an accessor method). This method
    //creates and returns a String containing all the information
    //about the state of the object.
    public String Output(){ //Maybe don't overwrite the base "toString method???"
		return name + " offered " + semester + " " + year + ". Taught By: " + instructor + ". Students: " + students;
	}

	public void addStudents(int students) {
		this.students += students;
	}
}