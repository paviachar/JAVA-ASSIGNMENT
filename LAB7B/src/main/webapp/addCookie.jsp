<%@ page import="javax.servlet.http.*" %>
<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    int age = Integer.parseInt(request.getParameter("cage"));

    // Create cookie
    Cookie cookie = new Cookie(name, domain);

    // Set expiry age
    cookie.setMaxAge(age);

    // Add cookie to response
    response.addCookie(cookie);
%>

<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

<h2>Cookie Successfully Added!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain (Value):</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>