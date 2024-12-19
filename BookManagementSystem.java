//Create a Book class with attributes like title, author, price, and ISBN.
//Implement methods to set and get book details,
//and a method to apply a discount to the book price.
import java.util.Scanner;
class BookManagement{
	String bookTitle;
	String bookAuther;
	float bookPrice;
	int bookISBN;
	
	void getBookDetails(int isbn) {
		if(isbn == bookISBN) {
		System.out.println("bookName =" + bookTitle);
		System.out.println("name of book auther = " +bookAuther);
		System.out.println("book price =  " +bookPrice);
		System.out.println("Book Isbn = "+bookISBN);
		}
	}

	void bookDiscount(float price) {
		System.out.println("Book discount on book price of = " +bookPrice+ " is "+(bookPrice*0.1f));
	}

	void setBook(Scanner sc) {
		System.out.println("Enter bookName = ");
		bookTitle= sc.next();
		System.out.println("Enter name of book auther = ");
		bookAuther = sc.next();
		System.out.println("Enter book price = ");
		bookPrice = sc.nextFloat();
		System.out.println("Enter name of bookIsnb = ");
		bookISBN = sc.nextInt();
		
	}
}
public class BookManagementSystem {
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		
		BookManagement b = new BookManagement();
		int value = 0;
		do {
			System.out.println("Your choice 1.enter Book details 2.get Book details");
			System.out.println("3.Get Discount 4.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				b.setBook(sc);
				break;
			}
			case 2: {
				System.out.println("Enter ISBN");
				b.getBookDetails(sc.nextInt());
				break;
			}
			case 3: {
				System.out.println("Enter Price of Book to get Discount = ");
				float rs = sc.nextFloat();
				b.bookDiscount(rs);
				break;
			}
			default:
				break;
				
			}

		} while (value != 4);
		sc.close();
	}
}
