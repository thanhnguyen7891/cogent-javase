/**
 * 
 */
package cogent.infotech.controller;

import cogent.infotech.DAO.ProductDAOImpl;

/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
public class ProductController {
	
	ProductDAOImpl dao = new ProductDAOImpl();
	
	public void create(int pId, String pName,
			String pCat, String manufacture_date,int price, String expire_date) {
		
		dao.addProduct(pId, pName, pCat, manufacture_date, price, expire_date);
	}
	
	public void update(int pId, String pName, String pCat, 
			String manufacture_date, int price, String expire_date) {
		dao.update(pId, pName, pCat, manufacture_date, price, expire_date);
		
	}
	
	public void findProductById(int pId) {
		dao.findProductById(pId);
	}
	
	public void findProductByCat(String pCat) {
		dao.findProductByCat(pCat);
	}
	
	public void findCheapestProductInCat(String pCat) {
		dao.findCheapestProductInCat(pCat);
	}
	
	public void findExpiredProducts(String expire_date) {
		dao.findExpiredProducts(expire_date);
	}
	
	public void deleteProductByCat(String pCat) {
		dao.deleteProductByCat(pCat);
	}
	
	public void deleteProductById(int pId) {
		dao.deleteProductById(pId);
	}
	
	

}
