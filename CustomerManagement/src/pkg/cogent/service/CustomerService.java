/**
 * 
 */
package pkg.cogent.service;

import com.cogent.dao.CustomerDAOImpl;

/**
 * @author : Thanh
 * @date   : Jan 18, 2023
 * 
 */
public class CustomerService {
	CustomerDAOImpl dao;
	public CustomerService() {
		dao = new CustomerDAOImpl();
	}

	public void save() {
		dao.create();

	}

	public void fetch() {
		dao.read();
	}

	public void modify(String cId) {
		dao.update(cId);
	}

	public void delete(String cId) {
		dao.delete(cId);
	}
	
	public void findById(String cId) {
		dao.findCustomerById(cId);
	}
	 
	public void findYoungest() {
		dao.findYoungestCustomer();
	}
}
