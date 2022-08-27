package com.myWorkApp;

import java.io.IOException;
import com.myWorkApp.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String customerName = request.getParameter("name");
		
		String customerSurname = request.getParameter("Surname");
		
		String customerGender = request.getParameter("genders");
		
		String customerBirthdate = request.getParameter("birthdate");
		
		String customerWorkAddress = request.getParameter("WorkAddress");
		
		String customerHomeAddress = request.getParameter("HomeAddress");
		
		
		
//		
//		User user = new User();
//		
//		user.setId(0);
//		user.setName(customerSurname);
//		user.setSurname(customerSurname);
//		user.setGender(customerGender);
//		user.setBirthdate(customerBirthdate);
//		user.setHomeAddress(customerHomeAddress);
//		user.setWorkAddress(customerWorkAddress);
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persUnit");
//	    EntityManager em = emf.createEntityManager();
//	    
//	    em.getTransaction().begin();
//	    em.persist(user);
//	    em.getTransaction().commit();
		String sql1 = "INSERT INTO `customers`.`customer_info` (`name`, `surname`, `gender`, `birthdate`) VALUES ("+"'"+customerName+"'"+", "+"'"+customerSurname+"'"+", "+"'"+customerGender+"'"+", "+"'"+customerBirthdate+"'"+")";
		
		
		
		String url = "jdbc:mysql://localhost:3307/customers";
		String username = "root";
		String password = "19051991";
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement st = conn.createStatement();
			int rs = st.executeUpdate(sql1,Statement.RETURN_GENERATED_KEYS);
			ResultSet result = st.getGeneratedKeys();
			
			
			result.next();
			int customerId = result.getInt(1);
			
			String sql2  =  "INSERT INTO `customers`.`home_address` (`home_address`, `myhome`) VALUES ("+"'"+customerHomeAddress+"'"+", "+"'"+customerId+"'"+")";
			String sql3  =  "INSERT INTO `customers`.`work_address` (`work_address`, `mywork`) VALUES ("+"'"+customerWorkAddress+"'"+", "+"'"+customerId+"'"+")";
			boolean rs2 = st.execute(sql2);
			boolean rs3 = st.execute(sql3);
			
			
			result.close();
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
	}
	

	


}
