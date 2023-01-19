/**
 * 
 */
package com.cogent.dao;

import java.util.Scanner;

import pkg.cogent.exception.MandatoryFieldException;
import pkg.cogent.model.Customer;

/**
 * @author : Thanh
 * @date   : Jan 18, 2023
 * 
 */
public class CustomerDAOImpl implements CustomerDAO {
	
	Customer customers[];
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void create() {
		
		System.out.println("How many customer you want to store?");
		int size=sc.nextInt();
		customers=new Customer[size];
		for(int i=0;i<customers.length;i++)
		{
			Customer cust=new Customer();
			System.out.println("Please enter customer ID:");
			String cid=sc.next();		
			System.out.println("Please enter customer name:");
			String cname=sc.next();
			System.out.println("Please enter customer email ");
			String eMail=sc.next();
			System.out.println("Please enter customer DOB: (yyyy/mm/dd)  ");
			String cDob = sc.next();
			
			
			cust.setcId(cid);
			cust.setcName(cname);
			cust.setcEmail(eMail);
			cust.setcDob(cDob);
			validateMandatoryField(cust);
			customers[i]=cust;
		}
	}
		public void validateMandatoryField(Customer customer)
		{
			if(customer==null)
			{
				throw new MandatoryFieldException("customer null");
			}
			else if(customer.getcId()==null)
			{
				throw new MandatoryFieldException("Customer ID is null");
			}
		}

		public void read() {
			for(int i=0;i<customers.length;i++)
			{
				System.out.println("Customer ID:"+customers[i].getcId());
				System.out.println("Customer  name:"+customers[i].getcName());
				System.out.println("Customer e-mail:"+customers[i].getcEmail());
				System.out.println("Customer DOB:"+customers[i].getcDob());

			}
		}

		@Override
		public void update(String customerId) {
					
			for (int i =0; i< customers.length; i++) {
				if (customerId == customers[i].getcId()) {
					System.out.println("1- Update name");
					System.out.println("2- Update email");
					System.out.println("3- Update DOB");
					
					int n = sc.nextInt();
					switch(n) {
					case 1:
						System.out.println("Please enter customer name: ");
						String name = sc.next();
						customers[i].setcName(name);
						break;
						
					case 2:
						System.out.println("Please enter customer email ");
						String cEmail = sc.next();
						customers[i].setcEmail(cEmail);			
						break;
						
					case 3:
						System.out.println("Please enter DOB to update:");
						String cDob = sc.next();
						customers[i].setcDob(cDob);
					}
				}
			}
		}

		@Override
		public void delete(String customerId) {
			for(int i = 0; i< customers.length; i++) {
				if(customerId.equals(customers[i].getcId())) {
					customers[i].setcId(null);
					customers[i].setcEmail(null);
					customers[i].setcName(null);
					customers[i].setcDob(null);
					System.out.println("Deleted customer " + customerId);

				}
				
			}
		}
		@Override
		public void findCustomerById(String customerId) {
			
			for(int i=0;i<customers.length;i++) {
				if (customerId.equals(customers[i].getcId())) {
					System.out.println("Customer ID:"+customers[i].getcId());
					System.out.println("Customer  name:"+customers[i].getcName());
					System.out.println("Customer e-mail:"+customers[i].getcEmail());
					System.out.println("Customer DOB:"+customers[i].getcDob());

				}
			}
		}
		
		
		@Override
		public void findYoungestCustomer() {
			// Store youngest found so far
			String youngestcId = null;
			String youngestcDob = null;
			
			for(int i=0; i< customers.length; i++) {
				// Compare this customer with youngest so far
				
				// Current youngest date of birth is stored in youngestcDob outside the loop
				
				// If this is the first not null customer, store it
				if(youngestcId == null) {
					youngestcId = customers[i].getcId();
					youngestcDob = customers[i].getcDob();
				}
				// Else if youngest customer has a lesser dob than this customer
				else if(youngestcDob.compareTo(customers[i].getcDob()) == -1) {
					youngestcId = customers[i].getcId();
					youngestcDob = customers[i].getcDob();
				}				
			}
			
			if(youngestcId != null){
				findCustomerById(youngestcId);
			}
		}
	

}
