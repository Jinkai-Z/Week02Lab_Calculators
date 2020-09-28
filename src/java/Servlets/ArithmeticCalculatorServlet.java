/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 782290
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgeArithmeticCalculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgeArithmeticCalculator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "Result:---";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String add = request.getParameter("add");
        String sub = request.getParameter("sub");
        String mul = request.getParameter("mul");
        String div = request.getParameter("div");
        String first = request.getParameter("first");
        String Second = request.getParameter("Second");
        String message = "";
        if (null != first && !"".equals(first) && null != Second && !"".equals(Second) && first.matches("[0-9]+") && Second.matches("[0-9]+")) {
            int one = Integer.parseInt(first);
            int two = Integer.parseInt(Second);
            int sum = 0;
            if (null != add && !"".equals(add)) {
                sum = one + two;

            }
            if (null != sub && !"".equals(sub)) {
                sum = one - two;
            }
            if (null != mul && !"".equals(mul)) {
                sum = one * two;
            }
            if (null != div && !"".equals(div)) {
                sum = one / two;
            }
            message = "Result: " + sum;
            request.setAttribute("message", message);

            request.getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        } else {
            message = "Result: invalid";
            request.setAttribute("message", message);

            request.getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
