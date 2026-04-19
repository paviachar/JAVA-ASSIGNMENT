<%@ page language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>

<%
    session.invalidate();
%>

<h2>You are logged out</h2>

<a href="index.jsp">Login Again</a>

</body>
</html>