
//Create a Course class with properties such as 
//courseID, courseName, instructorName, and fee. 
//Implement methods for students to enroll in the course, 
//view enrolled students, and calculate the total revenue generated 
//by the course enrollments.
import java.util.Scanner;

class OnlineCourse {
	int courseID = 10001;
	String courseName = "DAC";
	String instructorName = "Mr. nsNathan";
	float courseFees = 90000;
	String studentName;

	void getCourseDetails() {
		System.out.println("Course Id = " + courseID + " Course Name = " + courseName);
		System.out.println("Instructor Name = " + instructorName + " Course fees = " + courseFees);
	}

	void revenueGenerated(int noOfS) {
		System.out.println("Total revenue generated with " + noOfS + " is = " + noOfS * courseFees);
	}

	void setStudent(String sName, String courseN) {
		studentName = sName;
		System.out.println(sName + " you have been Assigned to " + courseName + " please pay " + courseFees + " rs");
	}

	void viewStudents() {
		System.out.println("All students details are below ");
		System.out.println("Student name = " + studentName + " admitted in " + courseName);
	}
}

public class OnlineCourceEnrollment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = 0;
		OnlineCourse o = new OnlineCourse();

		do {
			System.out.println("1.Check Course Details  2.enroll student in corse");
			System.out.println("3.View student 4.Calculate revenue generated");
			System.out.println("4.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				o.getCourseDetails();
				break;
			}
			case 2: {
				System.out.println("Enter your name and course you want =");
				o.setStudent(sc.next(), sc.next());
				break;
			}
			case 3: {
				o.viewStudents();
				break;
			}
			case 4: {
				System.out.println("Enter no of student entered in course = ");
				o.revenueGenerated(sc.nextInt());
				break;
			}
			default:
				break;

			}

		} while (value != 4);

		sc.close();

	}
}
