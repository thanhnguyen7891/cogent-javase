/**
 * 
 */
package cogent.infotech.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import cogent.infotech.jdbc.JDBCUtils;
import cogent.infotech.model.Product;


/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
public class ProductDAOImpl implements ProductDAO {
	Scanner sc =  new Scanner(System.in);
	
	private static final String INSERT_USERS_SQL = "INSERT INTO product"+
				"(pid, pname, category, manufacture_date, price, expire_date) VALUES" +
				"(?,?,?,?,?,?)";
	

	public void addProduct(int pId, String pName, String pCat, 
			String manufacture_date, int price, String expire_date) {
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(INSERT_USERS_SQL);
			pstmt.setInt(1, pId);
			pstmt.setString(2, pName);
			pstmt.setString(3, pCat);
			pstmt.setString(4, manufacture_date);
			pstmt.setInt(5, price);
			pstmt.setString(6, expire_date);
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Record added into DB");
			}
			else {
				System.out.println("Failed");
			}
			connection.close();
			pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	public void update(int pId, String pName, String pCat, 
			String manufacture_date, int price, String expire_date) {
		
		String QUERY = "update product set pname=?, category=?, "
				+ "manufacture_date=?, price=?, expire_date=? where pid=?";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setInt(6, pId);
			ps.setString(1, pName);
			ps.setString(2, pCat);
			ps.setString(3, manufacture_date);
			ps.setInt(4, price);
			ps.setString(5, expire_date);
			int update = ps.executeUpdate();
			if(update>0) {
				System.out.println("Product updated");
			}
			else {
				System.out.println("Failed");
			}
			connection.close();
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public void deleteProductById(int pId) {
		String QUERY = "delete from product where pid=?";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setInt(1, pId);
			int delete = ps.executeUpdate();
			if(delete>0) {
				System.out.println("Product deleted!");
			}
			else {
				System.out.println("Fail");
			}
			connection.close();
			ps.close();
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		
	}
	
	public void deleteProductByCat(String pCat) {
		String QUERY = "delete from product where category=?";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setString(1, pCat);
			int delete = ps.executeUpdate();
			if(delete>0) {
				System.out.println("Product deleted!");
			}
			else {
				System.out.println("Fail");
			}
			connection.close();
			ps.close();
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	}
	
	public void findCheapestProductInCat(String pCat) {
		String QUERY = "select min(price) as Lowest_price from product where category=?";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setString(1, pCat);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Lowest product is: "+ rs.getString(1));
			}
			connection.close();
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void findProductByCat(String pCat) {
		String QUERY = "select * from product where category=?";

		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setString(1, pCat);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Product ID is: "+ rs.getInt("pid"));
				System.out.println("Product name is: "+ rs.getString("pname"));
				System.out.println("Product category is: "+ rs.getString("category"));
				System.out.println("Product manufacture date is: "+ rs.getString("manufacture_date"));
				System.out.println("Product price is: "+ rs.getInt("price"));
				System.out.println("Product expire date is: "+ rs.getString("expire_date"));
			}
			connection.close();
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void findProductById(int pId) {
		String QUERY = "select * from product where pid=?";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setInt(1, pId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Product ID is: "+ rs.getInt("pid"));
				System.out.println("Product name is: "+ rs.getString("pname"));
				System.out.println("Product category is: "+ rs.getString("category"));
				System.out.println("Product manufacture date is: "+ rs.getString("manufacture_date"));
				System.out.println("Product price is: "+ rs.getInt("price"));
				System.out.println("Product expire date is: "+ rs.getString("expire_date"));
			}
			
			connection.close();
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void findExpiredProducts(String expire_date) {
		String QUERY = "select * from product where expire_date < curdate";
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement ps = connection.prepareStatement(QUERY);
			ps.setString(1, expire_date);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Product ID is: "+ rs.getInt("pid"));
				System.out.println("Product name is: "+ rs.getString("pname"));
				System.out.println("Product category is: "+ rs.getString("category"));
				System.out.println("Product manufacture date is: "+ rs.getString("manufacture_date"));
				System.out.println("Product price is: "+ rs.getInt("price"));
				System.out.println("Product expire date is: "+ rs.getString("expire_date"));
			}
			
			connection.close();
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	public void addProduct(int pId, String pName, String pCat, String manufacture_date, String expire_date) {
		// TODO Auto-generated method stub
		
	}


	public void update(int pId, String pName, String pCat, String manufacture_date, String expire_date) {
		// TODO Auto-generated method stub
		
	}
	

}
