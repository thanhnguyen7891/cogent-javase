/**
 * 
 */
package cogent.infotech.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author : Thanh
 * @date   : Jan 30, 2023
 * 
 */
public class JDBCUtils {
	private static String jdbcUrl="jdbc:mysql://localhost:3306/jdbc_demos";
	private static String jdbcUserName="root";
	private static String jdbcPassword="rootroot";
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassword);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
