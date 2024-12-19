
//Design a Library class with attributes bookList
//(list of books available), memberList (list of library members)
// and methods to issue a book to a member, return a book, and 
//search for books by title or author.
import java.util.Scanner;

class BookList {
	String bookTitle = "The Great Mind";
	String bookAuther = "Balaji";
	float bookPrice = 1200f;
	int bookISBN = 100;

	void getBookDetails(int isbn) {
		if (isbn == bookISBN) {
			System.out.println("bookName =" + bookTitle);
			System.out.println("name of book auther = " + bookAuther);
			System.out.println("book price =  " + bookPrice);
			System.out.println("Book Isbn = " + bookISBN);
		}
	}

	void getBookByBookName(String bName) {
		System.out.println("Book not found search again ");
	}
}

class MemberList {

	int memberId;
	String memberName;
	BookList book = new BookList();

	void issueBook(int memberId) {
		System.out.println("The book assigned to " + memberId);
	}

	void returnBook(int bookId) {
		System.out.println("Book returned successfully Thank you");
	}

	void searchBook(String bookName) {
		book.getBookByBookName(bookName);
	}

}

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MemberList m = new MemberList();
		int value = 0;
		do {
			System.out.println("Your choice 1.get Book details 2. return book");
			System.out.println("3.search book 4. issue book 5.Exit");
			value = sc.nextInt();

			switch (value) {
			case 2: {
				System.out.println("Enter bookId");
				m.returnBook(sc.nextInt());
				break;
			}
			case 1: {
				System.out.println("Enter ISBN to get details");
				m.book.getBookDetails(sc.nextInt());
				break;
			}
			case 3: {
				System.out.println("Search book by auther = ");
				m.searchBook(sc.next());
				break;
			}
			case 4: {
				System.out.println("Enter member Id");
				m.issueBook(sc.nextInt());
				break;
			}
			default:
				break;

			}

		} while (value != 5);

		sc.close();
	}
}
