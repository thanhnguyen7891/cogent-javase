/**
 * 
 */
package cogent.infotech.DAO;

/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
interface ProductDAO {
	
	public void addProduct(int pId, String pName, String pCat, String manufacture_date, int price, String expire_date);

	public void deleteProductById(int pId);

	public void deleteProductByCat(String pCat);

	public void findCheapestProductInCat(String pCat);

	public void findProductByCat(String pCat);

	public void findProductById(int pId);

	public void findExpiredProducts(String expire_date);

	public void update(int pId, String pName, String pCat,
			String manufacture_date, int price, String expire_date);
}
