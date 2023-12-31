<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
    background-image: url(https://images.pexels.com/photos/15200485/pexels-photo-15200485.jpeg?cs=srgb&dl=pexels-clayton-de-araujo-15200485.jpg&fm=jpg);
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment:fixed;
}

#container1{
    border: 2px solid black;
    box-shadow: 0px 0px 5px gray;
    margin-left: 400px;
    height: 800px;
    background: rgba(2, 2, 2, 0.3);
    width: 600px;

}
.form input{
    width: 230px;
    margin-bottom: 15px;
    padding: 10px;
    font-size: 15px;
    border-radius: 5px;
    border: 1px solid gainsboro;
    background-color: rgba(250, 244, 244, 0.7);;
    margin-left: 170px;
    text-align: center;
}

.form button{
    width: 253px;
    margin-bottom: 15px;
    color: #fff;
    font-size: 15px;
    font-weight: 400;
    border-radius: 5px;
    border: none;
    padding: 10px;
    background:#166fe5;
    cursor:pointer;
    margin-left: 170px;

}
h1{
    font-family:'Rubik sMoonrocks', sans-serif;    
    color: white;     
    font-weight: lighter; 
    font-size:30px;
    position:relative;
    left:220px;
}

p{
    color: white;
    font-size: 15px;
    position:relative;
    left:190px;
    top:-70px;

}   

hr{
    width: 270px;
    margin-left: 158px;

}

#login{
    text-decoration: none;
    color: white;
    margin-left: 165px;
}
#login:hover{
    text-decoration: underline;
}
h3{
    font-family:'Rubik sMoonrocks', sans-serif;    
    color: white;     
    font-weight: bold; 
    font-size:15px;
    position:relative;
    left:180px;
}
form input{
	outline:none;
	border:none;
}
.cross{
	position:relative;
	left:410px;
	top:35px;
	    cursor: pointer;
	
}

</style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<body>
 <% String msg=(String)request.getAttribute("msg"); %>
<%if(msg!=null){ %>
<h3 style="color:red"><%=msg %></h3>
<%} %>
    <div id="container1">
        <h1>QUALLECT</h1>
         <br><br><br>
        <p>Quality Selects at your doorstep!</p>
        <br>
                <span class="cross"><a href="home.jsp"><i class="fa-solid fa-xmark fa-xl" style="color: #fff;"></i></a></span>
        
        <h3>Restaurant Owner Registration</h3>
        <br>
        <form class="form" action="OwnerRegister" method="post">
            <input type="text" name="name" placeholder="Enter your name" required>
            <br>
            <input type="text" name="restaurantname" placeholder="Enter your Resaurant name" required>
            <br>
            <input type="email" name="email" placeholder="Enter your Email" required>
            <br>
            <input type="password" name="pwd" placeholder="Enter the password" required maxlength="4" minlength="4" pattern="[0-9]{4}">
            <br>
             <input type="text" name="location" placeholder="Enter your location" required>
            <br>
            <input type="tel" name="phone" placeholder="Enter your mobile number" required maxlength="10" minlength="10" pattern="[0-9]{10}" title="9123456789">
            <br>
          
            <button id="submit" type="submit">Register</button>
        </form>
        <hr>
        <br>
    <div id="container2">
        <a id="login" href="RestaurantLog.jsp">Existing User? Login</a>
    </div>
    </div>
  
</body>

</html>