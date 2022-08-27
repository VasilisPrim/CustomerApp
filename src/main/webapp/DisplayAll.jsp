<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ page import  = "java.util.ArrayList" %>  
<%@ page import  = "com.myWorkApp.User" %>
<%@ page import  = "javax.persistence.EntityManager" %>  
<%@ page import  = "javax.persistence.EntityManagerFactory" %>     
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>All Users</title>
<link rel="stylesheet" href="index.css">
</head>
<body>

	<h2>Employees Table</h2>
	
	<div class="mytable">

	<table class = "emp-table">
	
	<thead>
          <tr>
             <th>NAME</th>
             <th>SURNAME</th>
             <th>GENDER</th>
             <th>BIRTHDATE</th>
             <th>HOME ADDRESS</th>
             <th>WORK ADDRESS</th>
          </tr>
      </thead>
      
      <tbody>
      
      <%
      //EntityManagerFactory emf = Persistence.createEntityManagerFactory("persUnit");
      //EntityManager em = emf.createEntityManager();
      //User user = find(User.class,);
	
      ArrayList<User> myList;
	
	myList = (ArrayList<User>) request.getAttribute("users");
	for(User elem : myList){ %>
	
	<tr>
                <td><%=elem.getName() %></td>
                <td><%=elem.getSurname() %></td>
                <td><%=elem.getGender() %></td>
                <td><%=elem.getBirthdate() %></td>
                <td><%=elem.getHomeAddress() %></td>
                <td><%=elem.getWorkAddress() %></td>
            </tr>
            <%}
            
            %>
      
      </tbody>
</table>

</div>

<a href="index.jsp"><button class="btn-1">BACK</button></a>
	
</body>
</html>












