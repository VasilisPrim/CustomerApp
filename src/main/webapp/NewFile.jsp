<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register new user</title>
<link rel="stylesheet" href="index.css">
</head>
<body id = "myform">

	<form id = "newUser" action ="NewInput">
	<div>
       <label>Name</label>
       <input type="text" name="name" placeholder="Name" required>
     </div>
     
     <div>
        <label>Surname</label>
        <input type="text" name="Surname" placeholder="Surname" required>
     </div>
     
      <div>
        <label for = "gender">Gender</label>
        <select name="genders" id="gender" required>
             <option value="male">M</option>
             <option value="female">F</option>
        </select>
     </div>
     
     <div>
        <label for="birthday">Birthday:</label>
        <input type="date" name="birthdate" required >
     </div>
     
     <div>
        <label>Work Address</label>
        <textarea name = "WorkAddress" rows="3" cols="30"></textarea>
     </div>
     
     <div>
        <label>Home Address</label>
        <textarea name = "HomeAddress" rows="3" cols="30"></textarea>
     </div>
     
	
	
	
	<input id = "submit" type="submit" value="Submit">
	
	
	
	</form>





</body>
</html>