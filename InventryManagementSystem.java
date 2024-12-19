  //Create a ProductInventory class with attributes like 
//productID, productName, stockQuantity, and price. 
//Write methods to 
//add stock, remove stock, and 
//display current stock levels for a product.
import java.util.Scanner;
class InventryManagement{
	int productId;
	String productName;
	int stockQuantity;
	float price;
	
	void addStock(int pId) {
		if(productId == pId) {
			System.out.println("Stock added successfully");
		}
	}
	
	void removeStock(int pId) {
		if(productId == pId) {
			System.out.println("Stock removed successfully");
		}
	}
	
	void currentStockForProduct(int pId) {
		if(productId == pId) {
			System.out.println("for current product stock checked");
		}
	}
	
}
public class InventryManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		InventryManagement i = new InventryManagement();
		i.productId = 100;
		do {
			System.out.println("1.add stock 2.remove stock");
			System.out.println("3.display current stock levels for a product");
			System.out.println("4.Exit");
			value = sc.nextInt();

			switch (value) {
			case 1: {
				System.out.println("Lets add stock enter product Id =");
				i.addStock(sc.nextInt());
				break;
			}
			case 2: {
				System.out.println("Enter product id to remove stock = ");
			     i.removeStock(sc.nextInt());;
				break;
			}
			case 3: {
				System.out.println("Enter product id to check inventry stock for it = ");
				i.currentStockForProduct(sc.nextInt());
				break;
			}
			default:
				break;
				
			}

		} while (value != 4);
		System.out.println("happy to be of service");
		sc.close();

	}
}
