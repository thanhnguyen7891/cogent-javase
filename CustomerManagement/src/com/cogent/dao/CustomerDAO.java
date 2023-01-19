/**
 * 
 */
package com.cogent.dao;

/**
 * @author : Thanh
 * @date   : Jan 18, 2023
 * 
 */
public interface CustomerDAO {
	public void create();
	
	public void read();
	
	public void update(String customerId);
	
	public void delete(String customerId);

	public void findCustomerById(String cID);
	
	public void findYoungestCustomer();

	
}
