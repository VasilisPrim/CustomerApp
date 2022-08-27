package com.myWorkApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DisplayUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql = "SELECT `name`,`surname`,`gender`,`birthdate`,`home_address`,`work_address`"
				+ "FROM `customers`.`customer_info` INNER JOIN `customers`.`home_address`"
				+ "ON `customer_info`.`id`= `home_address`.`myhome`"
				+ "INNER JOIN `customers`.`work_address`"
				+ "ON `customer_info`.`id` = `work_address`.`mywork`;";
		
		
		
		
		
		
		
		
		
		String url = "jdbc:mysql://localhost:3307/customers";
		String username = "root";
		String password = "19051991";
		
		ArrayList<User> myUsers = new ArrayList<User>();
		
		
		
		
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				User user = new User(rs.getString("name"),rs.getString("surname"),rs.getString("gender"),rs.getString("birthdate"),rs.getString("home_address"),rs.getString("work_address"));
				myUsers.add(user);
			}
			
			
			
			request.setAttribute("users", myUsers);
			
			RequestDispatcher rd = request.getRequestDispatcher("DisplayAll.jsp");
			
			rd.forward(request, response);
			
			
			rs.close();
			st.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	

}
