/**
 * 
 */
package HuaShu;

import java.sql.*;

/**
 * @author Dahai
 * @Date 2015年10月2日
 * JDBC连接数据库查询
 */
public class JDBC {
//	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DRIVER = "sum.jdbc.odbc.jdbcOdbcDriver";
	public static final  String URL = "jdbc:odbc:people";
	public static final String USER = "root";
	public static final String PASS = "root";
	
	public static Connection conn = null;
	public static Statement stmt = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	
	public static void getInfo() {
		try {
			Class.forName(DRIVER);//加载驱动类
			conn = DriverManager.getConnection(URL,USER,PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from Staff where id='001'");
			
			//或者使用这样的
			String sql = "select * from Staff where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "001");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				String name = rs.getString("name");
				String name1 = rs.getString(1);//此方法更高效
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				int age = rs.getInt("age");
				System.out.println(name + " " +phone + " " + address + " " + age);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动类");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if(stmt != null){
				stmt.close();
				stmt = null;
			}
			if(conn != null){
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}












