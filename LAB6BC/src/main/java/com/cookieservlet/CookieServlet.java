// Build a servlet program to create a cookie to get your name through text box and press submit button( through HTML) to display the message by greeting Welcome back your name ! , you have visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.



package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60);
            userCookie.setPath("/");
            response.addCookie(userCookie);

            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(60);
            countCookie.setPath("/");
            response.addCookie(countCookie);
        }

        Cookie[] cookies = request.getCookies();
        String user = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    user = c.getValue();
                }
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        out.println("<html><body>");

        if (user != null) {
            count++;
            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(60);
            countCookie.setPath("/");
            response.addCookie(countCookie);

            out.println("<h2 style='color:blue;'>Welcome back, " + user + "!</h2>");
            out.println("<h2 style='color:magenta;'>Visited: " + count + " times</h2>");
            
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2 style='color:red;'>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Login'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie user = new Cookie("user", "");
        user.setMaxAge(0);
        user.setPath("/");

        Cookie count = new Cookie("count", "");
        count.setMaxAge(0);
        count.setPath("/");

        response.addCookie(user);
        response.addCookie(count);

        response.sendRedirect("CookieServlet");
    }
}