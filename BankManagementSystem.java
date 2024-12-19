
//Design a BankAccount class with properties such as 
//accountNumber, accountHolderName, balance.
//Include methods to deposit, withdraw, and display the balance.
import java.util.Scanner;

class BankManagement {
	int accountNumber;
	String accountHolderName;
	float accountBalance;

	void depositMoney(float rs) {
		accountBalance = accountBalance + rs;
	}

	void withdrawMoney(float rs) {
		accountBalance = accountBalance - rs;
	}

	void display() {
		System.out.println("Account name = " + accountHolderName);
		System.out.println("Account name = " + accountNumber);
		System.out.println("accounet balance = " + accountBalance);
	}

	void displayBalance() {
		System.out.println("Remaining balance = " + accountBalance);
	}

	void setUser(Scanner sc) {
		System.out.println("Enter accountNo = ");
		accountNumber = sc.nextInt();
		System.out.println("Enter name of acc holder = ");
		accountHolderName = sc.next();
		accountBalance = 0;
	}
}

public class BankManagementSystem {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);

		BankManagement b = new BankManagement();
		int value = 0;
		do {
			System.out.println("Your choice 1.enter customer details 2.get details");
			System.out.println("3.Add money to accc 4.withdraw money");
			System.out.println("5.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				b.setUser(sc);
				break;
			}
			case 2: {
				b.display();
				break;
			}
			case 3: {
				System.out.println("Enter money to deposit = ");
				float rs = sc.nextFloat();
				b.depositMoney(rs);
				break;
			}
			case 4: {
				System.out.println("Enter money to withdraw = ");
				float rs = sc.nextFloat();
				b.withdrawMoney(rs);
				b.displayBalance();
				break;
			}
			default:
				break;
				
			}

		} while (value != 5);
		sc.close();

	}
}
