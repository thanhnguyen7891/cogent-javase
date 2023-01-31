/**
 * 
 */
package cogent.infotech.main;

import java.util.Scanner;

import cogent.infotech.controller.ProductController;

/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ProductController pc = new ProductController();
		do {
			System.out.println("1- Add Product");
			System.out.println("2- Update Product");
			System.out.println("3- Find Product by ID");
			System.out.println("4- Find product by category");
			System.out.println("5- Find lowest product");
			System.out.println("6- Find Expire Product");
			System.out.println("7- Delete Product by ID");
			System.out.println("8- Delete Product by category");
			System.out.println("9- Exit");
			System.out.println("Please enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Please enter product id");
				int pId=sc.nextInt();
				System.out.println("Please enter product name");
				String pName=sc.next();
				System.out.println("Enter product category");
				String pCat=sc.next();
				System.out.println("Enter manufecture date");
				String manufecture_date=sc.next();
				System.out.println("Please enter price: ");
				int price = sc.nextInt();
				System.out.println("Please enter expiry date");
				String expiry=sc.next();
				pc.create(pId, pName, pCat, manufecture_date, price, manufecture_date);
				break;
				
			case 2:
				System.out.println("Please enter product id");
				int pId2=sc.nextInt();
				System.out.println("Please enter product name");
				String pName2=sc.next();
				System.out.println("Enter product category");
				String pCat2=sc.next();
				System.out.println("Enter manufecture date");
				String manufecture_date2=sc.next();
				System.out.println("Please enter price: ");
				int price2 = sc.nextInt();
				System.out.println("Please enter expiry date");
				String expiry2=sc.next();
				pc.update(pId2, pName2, pCat2, manufecture_date2,price2, expiry2);
				break;
				
			case 3:
				System.out.println("Please enter product ID: ");
				int pId3 = sc.nextInt();
				pc.findProductById(pId3);
				break;
				
			case 4:
				System.out.println("Please enter category you want to find: ");
				String pCat4 = sc.next();
				pc.findProductByCat(pCat4);
				break;
				
			case 5:
				System.out.println("Please enter category you want to find:");
				String pCat5 = sc.next();
				pc.findCheapestProductInCat(pCat5);
				break;
				
			case 6:
				System.out.println("Please enter date to find: ");
				String expire_date = sc.next();
				pc.findExpiredProducts(expire_date);
				break;
				
			case 7:
				System.out.println("Please enter product ID you want to delete: ");
				int pId7 = sc.nextInt();
				pc.deleteProductById(pId7);
				break;
				
			case 8:
				System.out.println("Please enter product category you want to delete: ");
				String pCat8 = sc.next();
				pc.deleteProductByCat(pCat8);
				break;
				
			case 9: System.exit(0);
			}
			
			
		} while(choice != 9);

	}

}
