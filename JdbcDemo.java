package javaJDBC;

import java.sql.*;
//import com.mysql.jdbc.Statement;

public class JdbcDemo {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String username = "root";
	private static String pwd = "root";

	public static void update() {
		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, pwd);
			stmt = conn.createStatement();
			String sql = "insert into user values('4','zs')";
			int count = stmt.executeUpdate(sql);
			if (count > 0) {
				System.out.println("操作成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void query() {
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, pwd);
			stmt = conn.createStatement();
			String sql = "select id,name from user where name like 'j%'";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				System.out.println("id:"+id+"name:"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
public static void main(String[] args) {
	//update();
	query();
}
}
