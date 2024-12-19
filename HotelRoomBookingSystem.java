//Design a Room class with attributes such as 
//roomNumber, roomType, ratePerNight, and availabilityStatus.
//Write methods to book a room, cancel a booking, and 
//calculate the total amount for a stay based on the number of nights booked.
import java.util.Scanner;
class HotelRoomBooking{
	int roomNo;
	String roomType;
	float ratePernight;
	boolean roomStatus;
	
	
	void bookRoom(String roomT) {
		if(roomStatus == true) {
			System.out.println("Room is Booked");
			roomStatus = false;
		}else {
			System.out.println("Room not available");
		}
		
		
	}
	
	void cancleRoomBooking(int roomN) {
		if(roomNo == roomN) {
			roomStatus = true;
			System.out.println("Your room is canceled");
		}else {
			System.out.println("No room available with no "+roomN);
		}
	}
	
	void calculateTotalPay(String roomType , int days) {
		System.out.println("for "+roomType+ " payment will be "+(ratePernight*days));
	}
	
	boolean roomStatus(int roomN) {
		if(roomN == roomNo) {
			System.out.println("Room available");
			return true;
		}else {
			System.out.println("Room not available");
			return false;
		}
	}
}
public class HotelRoomBookingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		HotelRoomBooking h = new HotelRoomBooking();
		do {
			System.out.println("1.book a room,2.cancel a booking ");
			System.out.println("3.calculate the total amount for a stay");
			System.out.println("3.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				System.out.println("Enter what room you want =");
				h.bookRoom(sc.next());
				break;
			}
			case 2: {
				System.out.println("Enter roomNo to cancle  = ");
			     h.cancleRoomBooking(sc.nextInt());;
				break;
			}
			case 3: {
				System.out.println("Enter room type and days stay = ");
				h.calculateTotalPay(sc.next(), sc.nextInt());
				break;
			}
			default:
				break;
				
			}

		} while (value != 5);
		sc.close();

	}
}
