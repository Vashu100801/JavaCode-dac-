//Create an Employee class with attributes like 
//employeeID, name, designation, and salary.
//Write methods to increase salary, display employee details,
//and calculate the annual bonus.
import java.util.Scanner;
class EmployeeManagement{
	int employeeID;
	String eName;
	String eDesg;
	float eSal;
	
	void displayEmployeeDetails(int eId) {
		if(eId == employeeID) {
		System.out.println("Employee name = " +eName);
		System.out.println("Employee desg name = " +eDesg);
		System.out.println("Employee Sal = " + eSal);
		}
	}

	void setEmployee(Scanner sc) {
		System.out.println("Enter Employee Id = ");
		employeeID = sc.nextInt();
		System.out.println("Enter name of Employee = ");
		eName = sc.next();
		System.out.println("Enter Designation Employee = ");
		eDesg = sc.next();
		System.out.println("Enter Sal Employee = ");
		eSal = sc.nextFloat();
		
	}
	
	void increaseEmpSal(int eid) {
		if(eid == employeeID) {
			System.out.println("Please check your experiance then apply again");
		}
		
	}
	
	void annualBonusEmp(float sal) {
		System.out.println("You will get on " +sal+ " upto "+(sal*0.10f));
	}
	
	
}
public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		EmployeeManagement e = new EmployeeManagement();
		do {
			System.out.println("0.enter Employee details 1.increase salary 2.display employee details");
			System.out.println("3.calculate the annual bonus");
			System.out.println("4.Exit");
			value = sc.nextInt();

			switch (value) {
			case 0: {
				System.out.println("Enter employee Details = ");
			     e.setEmployee(sc);
				break;
			}
			case 1: {
				System.out.println("Lets check your current sal enter your ID =");
				e.increaseEmpSal(sc.nextInt());
				break;
			}
			case 2: {
				System.out.println("Enter employee Id = ");
			     e.displayEmployeeDetails(sc.nextInt());;
				break;
			}
			case 3: {
				System.out.println("Enter sal to check annual bonus = ");
				float rs = sc.nextFloat();
				e.annualBonusEmp(rs);
				break;
			}
			default:
				break;
				
			}

		} while (value != 5);
		sc.close();

	}
}
