/**
 * 
 */
package cogent.infotech.model;

/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
public class Product {
	int pId;
	String pName;
	String pCat;
	String manufacture_date;
	int price;
	String expire_date;
	
	public Product() {
		
	}
	
	public Product(int pId, String pName, String pCat, String manufacture_date,  int price, String pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCat = pCat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expire_date = pPrice;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCat() {
		return pCat;
	}

	public void setpCat(String pCat) {
		this.pCat = pCat;
	}

	public String getManufacture_date() {
		return manufacture_date;
	}
	
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	
	public String getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		return "Product ID: "+ this.pId+ " Product name: "+this.pName+ "Product Category: "+ this.pCat
				+" Manufacture date: "+ this.manufacture_date+ " Price: "+ this.price+" Expire date: "+this.expire_date;
	}

}
