<%@ page language="java" session="true" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    int time = 1;

    try {
        time = Integer.parseInt(timeStr);
    } catch(Exception e) {
        time = 1;
    }

    int seconds = time * 60;

    session.setAttribute("username", name);
    session.setMaxInactiveInterval(seconds);
%>

<h3>Welcome, <%= name %>!</h3>
<p>Session active for <%= seconds %> seconds.</p>

<a href="check.jsp">Check Session Status</a>
<br><br>
<a href="logout.jsp">Logout</a>

</body>
</html>