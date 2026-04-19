<%@ page language="java" session="false" %>
<html>
<head>
    <title>Session Status</title>
</head>
<body>

<h2>Session Status</h2>

<%
    HttpSession sess = request.getSession(false);

    if (sess != null && sess.getAttribute("username") != null) {
        String name = (String) sess.getAttribute("username");
%>
        <h3>Welcome back <%= name %></h3>
        <p>Session is active</p>
<%
    } else {
%>
        <h3>Session Expired!</h3>
        <a href="index.jsp">Login Again</a>
<%
    }
%>

</body>
</html>