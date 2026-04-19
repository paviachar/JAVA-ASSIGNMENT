<%@ page import="javax.servlet.http.*" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    int visitCount = 0;

    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("visitCount")) {
                visitCount = Integer.parseInt(c.getValue());
            }
        }
    }

    visitCount++;

    // Create cookies
    Cookie nameCookie = new Cookie("username", name);
    Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

    // Expiry (demonstration: 30 seconds)
    nameCookie.setMaxAge(30);
    visitCookie.setMaxAge(30);

    response.addCookie(nameCookie);
    response.addCookie(visitCookie);

    // Output
    out.println("<h2>Welcome back " + name + "!</h2>");
    out.println("<h3>You have visited this page " + visitCount + " times</h3>");

    // Display cookies
    out.println("<h3>Cookies List:</h3>");
    if (cookies != null) {
        for (Cookie c : cookies) {
            out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
        }
    } else {
        out.println("No cookies found");
    }
%>

<br><br>
<a href="index.html">Go Back</a>

</body>
</html>