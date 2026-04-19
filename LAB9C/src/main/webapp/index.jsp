<!--  Build a Session Management using JSP program for getting  session expiry time and your name through text box and press submit to display the message by greeting Hello your name!.press the following link to check it within  the set session time  or wait there for the minutes set  to see the session expiry.-->

<%@ page language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h2>Session Login</h2>

<form action="welcome.jsp" method="post">
    
    Enter Time (in minutes): 
    <input type="number" name="time" required><br><br>
    
    Enter Name: 
    <input type="text" name="username" required><br><br>
    
    <input type="submit" value="Start Session">

</form>

</body>
</html>