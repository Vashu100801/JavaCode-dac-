//Implement a Car class with properties such as 
//carModel, registrationNumber, rentalRatePerDay, and availability.
//Write methods to rent a car, return a car, and display the rental charges.

import java.util.Scanner;

class CarRental{
	String carModel;
	String regNumber;
	float rentalRatePerDay;
	boolean availability;
	
	void rentCar(String carM) {
		if(checkAvailability(carM)) {
			System.out.println("You got car sir");
		}
		System.out.println("Please return our car after booked time or you will have to pay per day charges");
		
	}
	
	void returnCar(String regNum) {
		System.out.println("Thank you your patronage see you soon");
		availability=true;
	}
	
	boolean checkAvailability(String carM) {
		if(availability == true)
			return true;
		return false;
	}
	void rentalChargePerDay(String carM) {
		int num = carM.compareToIgnoreCase(carModel);
		if(num == 0) {
			System.out.println("you need to pay = "+rentalRatePerDay+" per day after borrowing time");
		}else
		System.out.println("Sir please enter valid car model no");
	}
	
}
public class CarRentalSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarRental car = new CarRental();
		car.availability = true;
		car.carModel = "Scoda";
		car.regNumber = "7180";
		car.rentalRatePerDay = 1000f;
		
		int value = 0;
		do {
			System.out.println("1.rent a car  2. return a car, 3.display the rental charges");
			System.out.println("4.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				System.out.println("Enter Car Model To rent");
				car.rentCar(sc.next());
				break;
			}
			case 2: {
				System.out.println("Enter which car you took from us");
				car.returnCar(sc.next());
				break;
			}
			case 3: {
				System.out.println("Enter Car Model to get charges = ");
				car.rentalChargePerDay(sc.next());
				break;
			}
			default:
				break;
				
			}

		} while (value != 5);
		sc.close();

	}
}
