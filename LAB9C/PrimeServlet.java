//. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.



package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        try {
            // Step 3: Get input
            String input = request.getParameter("num");

            // Step 4: Convert to integer
            int num = Integer.parseInt(input);

            // Step 5: Validate number
            if (num <= 1) {
                out.println("<h3 style='color:red;'>Error: Enter number greater than 1</h3>");
            } else {

                // Step 6: Check prime
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // Step 7: Display result
                if (isPrime) {
                    out.println("<h2 style='color:green;'>" + num + " is a Prime Number</h2>");
                } else {
                    out.println("<h2 style='color:blue;'>" + num + " is NOT a Prime Number</h2>");
                }
            }

        } catch (NumberFormatException e) {
            // Step 8: Error Handling (Invalid Input)
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Error Code 400
            out.println("<h3 style='color:red;'>Error 400: Invalid input! Please enter a valid number.</h3>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}