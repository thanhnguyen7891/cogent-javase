/**
 * 
 */
package pkg.cogent.controller;

import java.util.Scanner;

import pkg.cogent.service.CustomerService;

/**
 * @author : Thanh
 * @date   : Jan 18, 2023
 * 
 */
public class CustomerController {
	CustomerService cs;
	Scanner sc = new Scanner(System.in);

	public CustomerController() {
		cs = new CustomerService();
	}

	public void accpept(int choice) {
		String cId;
		switch (choice) {
		case 1:
			cs.save();
			break;
		case 2:
			cs.fetch();
			break;
		case 3:
			System.out.println("Please enter the customer ID");
			cId = sc.next();
			cs.modify(cId);
			break;
		case 4:
			System.out.println("Please enter the customer ID");
			cId= sc.next();
			cs.delete(cId);
			break;
			
		case 5:
			System.out.println("Please enter the customer ID: ");
			cId = sc.next();
			cs.findById(cId);
			break;
			
		case 6:
			cs.findYoungest();
			break;
			
		case 7:
			System.exit(choice);
			break;
		}
	}
}
