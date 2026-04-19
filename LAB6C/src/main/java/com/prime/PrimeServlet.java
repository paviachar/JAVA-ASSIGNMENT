// Build a servlet program to check the given number is prime number or not using HTML with step bystep procedure.
package com.prime;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")   // ✅ IMPORTANT LINE
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("num");

        try {
            int num = Integer.parseInt(input);

            if (num <= 1) {
                out.println("<h3>Number must be greater than 1</h3>");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    out.println("<h2>" + num + " is a Prime Number</h2>");
                } else {
                    out.println("<h2>" + num + " is NOT a Prime Number</h2>");
                }
            }

        } catch (Exception e) {
            out.println("<h3>Invalid Input!</h3>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");
    }
}